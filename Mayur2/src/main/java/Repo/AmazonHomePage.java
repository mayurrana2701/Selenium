package Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	private WebDriver driver;
		
	public AmazonHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
    	}

	
	



	public WebElement SearchField(){
		
	WebElement SearchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));	
	return SearchField;
	}
	
	public WebElement SubmmitButton(){
		
	WebElement SubmitButton = driver.findElement(By.xpath("//input[@value=\"Go\"]"));	
	return SubmitButton;
	}
	
	
}
