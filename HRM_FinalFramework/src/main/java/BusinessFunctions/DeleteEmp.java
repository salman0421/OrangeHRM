package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import LIB.Common;

public class DeleteEmp {

	Common browser;
	Properties locators;
	public DeleteEmp(Common br,Properties loc,String locfile) throws FileNotFoundException, IOException
	{
		browser=br;
		locators=loc;
		locators.load(new FileInputStream(locfile));

	}
	
	public void deleteemp(String empId)
	{	
		browser.selectFrameById("rightMenu");
		browser.click("xpath","//table/tbody/tr/td[2][contains(text(),"+empId+")]/preceding-sibling::td/input");
		browser.click("xpath", "//div[@class='actionbuttons']/input[2]");
	}

	
	
	
	
}
