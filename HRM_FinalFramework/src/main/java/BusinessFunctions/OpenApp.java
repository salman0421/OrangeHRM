package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LIB.Common;

public class OpenApp {


	Common browser;
	Properties locators;
	public OpenApp(Common br, Properties loc,String locfile) throws FileNotFoundException, IOException
	{
		browser=br;
		locators=loc;
		locators.load(new FileInputStream(locfile));
	}
	
	


	public void openApp(String url)
	{
		browser.startBrowserFirefox();
		browser.openApp(url);
	}
	
	
}
