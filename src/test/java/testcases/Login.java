package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.BrowserFactory;

public class Login {
  WebDriver driver ;
 
	
@BeforeTest
public void openbrowser() throws InterruptedException {
	
	driver=BrowserFactory.launchbrowser(driver,"Chrome","https://menugreat.com/console/");
	Thread.sleep(5000);
	 
}

@Test
	public void loginWeb () throws InterruptedException 
	{
	LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	loginPage.enterUserName("mehedi.hasan@orocube.net");
	loginPage.enterUserPasword("2222");
	loginPage.loginBtn();
	
		
		
	}
	
	
}
