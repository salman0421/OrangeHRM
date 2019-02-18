package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Loginex;

public class TC_Login extends RootTest {

	@Test
	public  void login() throws FileNotFoundException, IOException
	{
		Loginex login=new Loginex(brow,locators);
		login.logintoApp();
		
		
				
	}
	
	
	
	
	
}
