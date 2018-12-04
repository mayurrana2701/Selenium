package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class BrowserControl extends Webconnector{

	@Before	
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "../CucumberDemo/src/test/java/Resources/chromedriver.exe");
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
     }
	
	@After
	public void closeBrowser() {
	//	driver.close();
	}
}
