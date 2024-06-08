package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil extends BaseClass {
	
	public void screenshot(WebDriver driver) throws IOException {
		
		LocalDateTime dateTime = LocalDateTime.now();
		String date= dateTime.toString().replace(":", "-");
		
	TakesScreenshot ss = (TakesScreenshot)driver;  
		File src =ss.getScreenshotAs(OutputType.FILE);
		File des = new File("./test-output/Screenshot/"+date+".png");
		FileHandler.copy(src, des);	
	
	}
}

//========================================================================		
		
	/*	@Override
		public void onTestStart(ITestResult result) {
			Reporter.log("test script execution started",true);
		}
		
		LocalDateTime dateTime = LocalDateTime.now();
		String date= dateTime.toString().replace(":", "-");
		
		@Override
		public void onTestFailure(ITestResult result) {
			Reporter.log("test script failed",true);
			TakesScreenshot ss=(TakesScreenshot)driver;
			File source= ts.getScreenshotAs(OutputType.FILE);
			File target= new File("./screenshot/"+date+".png");
			try {
				FileHandler.copy(source, target);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override 
		public void onTestSuccess(ITestResult result) {
			Reporter.log("test script passed",true);
		}
	}
	 */
		
