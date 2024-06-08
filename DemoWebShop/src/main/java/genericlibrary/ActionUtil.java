package genericlibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtil extends BaseClass  {
	
	public void clickOnElement(WebElement targetElement) {
	
		Actions actions= new Actions(driver);
		actions.click(targetElement).perform();

}
}