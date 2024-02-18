package day4_17012024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(day4_17012024.ListenerTest.class)   //(packagename.classname.class)

public class ListenersDemo {

	@Test
	public void login() throws InterruptedException
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  
	  String actualTitle = driver.getTitle();
	  String ExpectedTitle = "OrangeHRM";
//	  if(actualTitle.equals(ExpectedTitle))
//	  {
//		  System.out.println("Test case pass");
//	  }
//	  else
//	  {
//		  System.out.println("Test case failed.");
//	  }
	  
	  //in place of if else we can use assert
	  Assert.assertEquals(actualTitle, ExpectedTitle);
	}
	
	@Test
	public void testToBeFailed()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void testToBeSkipped()
	{
	  throw new SkipException("Skipping it forcefully");
	}
}
