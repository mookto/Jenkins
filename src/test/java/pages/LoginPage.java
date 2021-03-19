package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver driver;
public LoginPage (WebDriver ldriver) {
	 this.driver=ldriver;
}
	
	
	@FindBy (xpath="//input[@id='login-email']")
	WebElement username_field;
	@FindBy (xpath="//input[@id='login-pass']")
	WebElement userpass_field;
	@FindBy (xpath="//div[@id='console-951510359']/div/div[2]/div/div/div/div/div/div/div/div[9]/div/div/div")
	WebElement login_btn;
	
	
	
	public void enterUserName(String username) {
		username_field.sendKeys(username);
	}
	public void enterUserPasword(String pass) {
		userpass_field.sendKeys(pass);
	}
	public void loginBtn( ) {
		 login_btn.click();
	}

	 
	
}
	
	
	
	
	
	
	
	
	
	
	

