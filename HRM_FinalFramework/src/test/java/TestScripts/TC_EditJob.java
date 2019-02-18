package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Login;

public class TC_EditJob extends RootTest{

	@Test
	public void editJob() throws FileNotFoundException, IOException
	{
		Login login=new Login(brow,locators,locfile);
		brow.startBrowserFirefox();
		login.loginToapp("qaplanet1", "lab1");
		Admin admin=new Admin(brow,locators,locfile);
		admin.editJob("Software Tester","Associate TestEngineer");
		
		
	}
	
	
	
}
