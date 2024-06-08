package genericlibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver ;
	
	
	//======DataBase Connection===========
	
	@BeforeSuite
	public void DatabaseConnection() {
		Reporter.log("DataBase is Connected",true);
	}
	
	//======= Pre conditions validation =============
	
	@BeforeTest
	public void WebsiteLinkValidation() throws IOException {
		
		  driver = new ChromeDriver();
		UtilityMethod um = new UtilityMethod();
		String URL = um.getDataFromPropertyFile("url");
		driver.get(URL);
		Reporter.log("The website is launched",true);
		
		ScreenshotUtil ss = new ScreenshotUtil();
		ss.screenshot(driver);
		Reporter.log("The screenshot is taken", true);
		
	String Actualurl = driver.getCurrentUrl();
	String expectedUrl = "https://demowebshop.tricentis.com/login";
	if(Actualurl.equals(expectedUrl))
	{
		Reporter.log("The website url is correct as expected",true);
	}
	else
	{
		Reporter.log("The website url is wrong and not as expected url", true);
	}
	}
	
	@AfterTest
	public void WebsiteClose() {
		driver.close();
		System.out.println("The website is closed successfully");
	}

		
	
}