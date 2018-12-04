package Mayur2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Repo.AmazonHomePage;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "../Mayur2/src/test/java/Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.get("http://www.Amazon.co.uk");
        
        AmazonHomePage AHP = new AmazonHomePage(driver);
}
}
