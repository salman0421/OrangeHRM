package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.DeleteEmp;
import BusinessFunctions.Login;

public class TC4_DelEmp extends RootTest{
	@Test
	public void deleteemp() throws FileNotFoundException, IOException 
	{
		Login login=new Login(brow,locators,locfile);
		
		DeleteEmp delEmp=new DeleteEmp(brow,locators,locfile);
		
		brow.startBrowserFirefox();
		brow.maximiseBrowser();
		login.loginToapp("qaplanet1","lab1");
		
		delEmp.deleteemp("9670");
		
		
		
		
		
		
		
		
		
	}
}
