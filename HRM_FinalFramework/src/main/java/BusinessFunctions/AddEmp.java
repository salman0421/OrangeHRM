package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LIB.Common;

public class AddEmp {
	Common browser;
	Properties locators;
	public AddEmp(Common br,Properties loc,String locfile) throws FileNotFoundException, IOException
	{
		browser=br;
		locators=loc;
		locators.load(new FileInputStream(locfile));
	}
	public void addEmp(String firstname,String lastname) throws Exception
	{
	
		
		//click on add emp
		browser.startAction();
		//selecting frame
		browser.selectFrameById("rightMenu");	
		//click on add button
		browser.click("xpath", "//*[@id='standardView']/div[3]/div[1]/input[1]");
		//Wait until PIM : Add Employee displayed
		//browser.waitUntilElementPresent("//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2");
		Thread.sleep(1000);
		//Verify PIM : Add Employee text
		browser.verifyText("xpath", "//*[@id='frmEmp']//div//div[1]//div[2]//div[1]//h2", "PIM : Add Employee");
		
		//enter first and last name
		browser.sendKeys("id", "txtEmpLastName",lastname);
		browser.sendKeys("name", "txtEmpFirstName", firstname);
		browser.sleepThread(2000);
		//click on save button
		browser.click("id", "btnEdit");
		
		//wait for Personal Details 
		//browser.waitUntilElementPresent("//*[@id='personal']/div[1]/div[2]/div[1]/h2");
		Thread.sleep(1000);
	}
	public void verifyItemInEmpList(String firstname,String lastname)throws Exception
	{
		//select frame
		browser.selectFrameDefault();
		//click on emp list
		browser.click("linkText", "PIM");			
		//select frame
		browser.selectFrameById("rightMenu");
		//Wait for Employee info element
		//browser.waitUntilElementPresent("//*[@id='standardView']/div[1]/h2");
		Thread.sleep(1000);
		//verify Employee information
		browser.verifyText("xpath", "//*[@id='standardView']/div[1]/h2", "Employee Information");
		//wait for 2 sec
		browser.sleepThread(2000);
		String itemname=firstname+" "+lastname;
		browser.verifyElementInTable("//table[@class='data-table']/tbody/tr/td[3]",itemname);
	}


}
