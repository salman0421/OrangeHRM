package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Login;

public class TC5_AddJob extends RootTest {
	@Test
	public void addJob() throws FileNotFoundException, IOException
	{
		
		brow.startBrowserFirefox();
		Login login=new Login(brow,locators,locfile);
		login.loginToapp("qaplanet1", "lab1");
		Admin admin=new Admin(brow,locators,locfile);
		admin.Addjob("Software Tester", "Test Engineer");
		
	}
}
