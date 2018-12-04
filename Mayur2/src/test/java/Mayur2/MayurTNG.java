package Mayur2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class MayurTNG {
 
	@Test
  public void PrintSomething () {
		
		System.out.println("My first Test NG class");
  }
 
	
	@BeforeMethod
  public void beforeMethod() {
  }

}
