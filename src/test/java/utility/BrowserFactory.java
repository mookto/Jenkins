package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	 WebDriver driver;
	public static WebDriver launchbrowser ( WebDriver driver,String browserName,String appurl) 
	{
		if (browserName.equals("Chrome")) {
			String projectpath= System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath +"/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		else if (browserName.equals("Firefox"))
		{
			String projectpath= System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectpath +"/Drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		else if (browserName.equals("IE"))
		{
			
		}
		
		
	   else 
	{
		System.out.println("We do not support your browser");
	}
	     
		
		  driver.get(appurl);
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 
		return driver;
	}

	public static void quitBrowser( WebDriver driver) {
		driver.quit();
	}
	 
}
