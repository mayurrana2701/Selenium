package Mayur2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Repo.AmazonHomePage;


public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        
		System.setProperty("webdriver.chrome.driver", "../Mayur2/src/test/java/Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
        driver.get("http://www.Amazon.co.uk");
        
       AmazonHomePage LP = new AmazonHomePage(driver);
       
       LP.SearchField().sendKeys("T-Shirts");
       LP.SubmmitButton().click();
       
       // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-Shirts");
      //  driver.findElement(By.xpath("//input[@value='Go']")).click();
        String Title = driver.getTitle();
        System.out.println(Title);
        
        
        WebElement List = driver.findElement(By.xpath(""));
        
              
        driver.close();

	}

}
