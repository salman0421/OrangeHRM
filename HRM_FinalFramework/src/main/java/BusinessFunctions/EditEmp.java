package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import LIB.Common;

public class EditEmp {
	Common browser;
	Properties locators;
	
	
	public EditEmp(Common brow, Properties loc, String locfile) throws FileNotFoundException, IOException
	{
		browser=brow;
		locators=loc;
		locators.load(new FileInputStream(locfile));
	}
	
	public void editemp(String empId,String fname,String lname)
	{
		
		//browser.selectFrameById("rightMenu");
		
		browser.sleepThread(1000);
		browser.selectFrameById("rightMenu");
		browser.verifyElementInTableandClick("//table/tbody/tr/td[2][contains(text(),"+empId+")]/following-sibling::td/a");
		browser.sleepThread(1000);
		browser.click("xpath", "//div[@class='formbuttons']/input");
		browser.sleepThread(1000);
		
		browser.ClearTextField("id", "txtEmpFirstName");
		browser.sendKeys("id", "txtEmpFirstName",fname);
		browser.ClearTextField("id", "txtEmpLastName");
		browser.sendKeys("id", "txtEmpLastName", lname);
		browser.sleepThread(1000);
		browser.click("xpath", "//div[@class='formbuttons']/input");
		
		WebElement attr=browser.FindElementByLoc("xpath", "//input[@id='txtEmployeeId']");
		
		browser.selectFrameDefault();
		browser.startAction();
		browser.MouseOverToElement("xpath", "//div[@id='top-menu']/ul/li[2]/a");
		browser.click("xpath","//div[@id='top-menu']/ul/li[2]/ul/li[2]/a/span");
		browser.sleepThread(2000);
		
		//browser.selectFrameDefault();
		browser.click("xpath", "//ul[@id='nav']/li[2]/a");
		String ename=fname+lname;
		browser.sleepThread(1000);
		browser.verifyElementInTable("//table/tbody/tr/td[3]",ename);
		
		
	}
	
}
