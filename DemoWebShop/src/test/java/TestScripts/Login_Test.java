package TestScripts;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.ScreenshotUtil;
import genericlibrary.UtilityMethod;
import pomrepositores.LoginPage;


public class Login_Test extends BaseClass {
	
	@Test
	public void Login() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		UtilityMethod um = new UtilityMethod();
		ScreenshotUtil ss = new ScreenshotUtil();
		
		String email = um.getDataFromPropertyFile("email");
		login.getEmail().sendKeys(email);
		Reporter.log("Entered the correct Email ID",true);
		
		ss.screenshot(driver);
		Reporter.log("The screenshot is taken", true);
		
		String pwd = um.getDataFromPropertyFile("password");
		login.getPwdBox().sendKeys(pwd);
		Reporter.log("Entered the correct password", true);
		
		ss.screenshot(driver);
		Reporter.log("The screenshot is taken", true);
		
		login.getloginButton().click();
		Reporter.log("The login button is clicked", true);
		
		ss.screenshot(driver);
		Reporter.log("The screenshot is taken", true);
	}

}
