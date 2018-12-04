package Mayur2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EOnwebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "../Mayur2/src/test/java/Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  
        
        
        driver.get("https://www.eonenergy.com/");
    //     Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"mainform\"]/div[8]/div/div/div[2]/button/img")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"getquote\"]/div[1]/a")).click();
   //      WebElement Mayur = driver.findElement(By.className("c-button__text"));
      //   Mayur.click();
     //   driver.findElement(By.xpath("/html/body/form[1]/div[6]/div/div[2]/div/div[1]/a")).click();
    //  driver.findElement(By.linkText("Login")).click();
   //  driver.quit();
   //   String Mayur = driver.getTitle();
   //   System.out.println(Mayur);
   //   driver.findElement(By.id("username")).sendKeys("ABCD");
   //   driver.findElement(By.className("c-button__text")).click();
      
		
		
		
		
	}

}
