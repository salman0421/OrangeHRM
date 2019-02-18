package TestScripts;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.EditEmp;
import BusinessFunctions.Login;

public class TC3_EditEmp extends RootTest{
	
	@Test
	public static void editEmp() throws Exception, IOException
	{

Login login=new Login(brow,locators,locfile);
	EditEmp editEmp=new EditEmp(brow,locators,locfile);
	brow.startBrowserFirefox();
	brow.maximiseBrowser();
	login.loginToapp("qaplanet1", "lab1");
	editEmp.editemp("9661","hari", "kumar");
	
	
	
	
	
	
	
	}
	
}
