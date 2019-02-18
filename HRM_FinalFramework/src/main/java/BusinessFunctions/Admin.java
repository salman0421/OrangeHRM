package BusinessFunctions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LIB.Common;

public class Admin 
{
	Common browser;
	Properties locators;
	//constructor with one argument.
	public Admin(Common br, Properties loc,String locfile) throws FileNotFoundException, IOException
	{
		browser=br;
		locators=loc;
		locators.load(new FileInputStream(locfile));
	}
	

	//Add location
	public void Addjob(String jobname,String description)
	{
		
	
		browser.startAction();
		browser.MouseOverToElement("xpath", "//div[@id='top-menu']/ul/li/a");
		browser.MouseOverToElement("xpath","//ul[@id='nav']/li/ul/li[2]/a");
		browser.click("xpath", "//ul[@id='nav']/li/ul/li[2]/ul/li/a");
		browser.selectFrameById("rightMenu");
		browser.click("xpath", "//input[@value='Add']");
		browser.sleepThread(2000);
		browser.sendKeys("name", "txtJobTitleName", jobname );
		browser.sendKeys("name", "txtJobTitleDesc", description);
		browser.click("xpath", "//div[@class='formbuttons']/input");
		browser.click("xpath", "//div[@class='navigation']/input");
		browser.sleepThread(1000);
		browser.verifyElementInTable("//table/tbody/tr/td[3]", jobname);
	}	
	public void editJob(String jobname,String description)
	{
		browser.startAction();
		browser.MouseOverToElement("xpath", "//div[@id='top-menu']/ul/li/a");
		browser.MouseOverToElement("xpath","//ul[@id='nav']/li/ul/li[2]/a");
		browser.click("xpath", "//ul[@id='nav']/li/ul/li[2]/ul/li/a");
		browser.selectFrameById("rightMenu");
		browser.verifyElementInTableandClick("//table/tbody/tr/td[3]/a",jobname);
		browser.sleepThread(1000);
		browser.click("xpath", "//div[@class='formbuttons']/input");
		browser.ClearTextField("name", "txtJobTitleDesc");
		browser.sendKeys("name", "txtJobTitleDesc", description);
		
		browser.click("xpath", "//div[@class='formbuttons']/input");
		
		
		
	}
	
	
	
}
