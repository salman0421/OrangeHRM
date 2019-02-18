package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BusinessFunctions.OpenApp;

//import BusinessFunctions.OpenApp;

public class TC_Open extends RootTest{

	WebDriver driver;
	@Test
	//Start firefox Browser
	public void startBrowserFirefox()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP16\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");			
	}
	public void maximiseBrowser()
	{
		driver.manage().window().maximize();
	}
	public static void openApp() throws FileNotFoundException, IOException
	{
		OpenApp open=new OpenApp(brow,locators,locfile);
		
		
		brow.openApp("http://apps.qaplanet.in/qahrm/login.php");
		//brow.openApp("http://apps.qaplanet.in/qahrm/login.php");
		
	}
	
	
	
}