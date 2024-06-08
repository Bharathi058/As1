package pomrepositores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage{
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
		@FindBy(id="Email")
		 public WebElement Email;
		
		public WebElement getEmail(){
			return Email;
		}
			
		@FindBy(id="Password")
		public WebElement Pwd;
		
		public WebElement getPwdBox() {
			return Pwd;
		}
		
		@FindBy(xpath ="//input[@type=\"submit\" and @value=\"Log in\"]")
		public WebElement loginButton;
		
		public WebElement getloginButton() {
			return  loginButton;
		}
			
		
}

