package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LIB.Common;

public class Loginex{

	Common browser;
	Properties locators;
	public Loginex(Common br,Properties loc) throws FileNotFoundException, IOException
	{
		browser=br;
		locators=loc;
		
	}
	
	public void logintoApp()
	{
		browser.startBrowserFirefox();
		browser.verifyElementPresent("name", "txtUserName");
		browser.verifyElementPresent("name","txtPassword");
		browser.verifyElementPresent("name", "Submit");
		browser.sendKeys("name", "txtUserName", "qaplanet1");
		browser.sendKeys("name", "txtPassword", "lab1");
		browser.click("name", "Submit");
		
		
	}
	
	
}
