package TestScripts;
import java.util.Properties;

import org.testng.annotations.Test;
import BusinessFunctions.Login;
import LIB.Common;
public class Tc1_Login extends RootTest
{

	@Test
	public static void verifyOrangeHRM() throws Exception
	{
		
		Login login=new Login(brow,locators,locfile);
		      
		//---------------------------------------------------------
		brow.startBrowserFirefox();
		brow.maximiseBrowser();
		//verify title
		brow.verifyTitle("OrangeHRM - New Level of HR Management");
		login.loginToapp("qaplanet1","lab1");
		brow.waitForPageToLoad();
		
		login.logout();
		brow.closeBrowser();
		brow.QuitObject();
		
		
	}
	
}
