package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionUtil {
	
	public void selectDropDownByVisibleText(WebElement dropdown,String visibleText)
	{
		
		Select s= new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
	
	//=====Alert=======================
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	 

}
