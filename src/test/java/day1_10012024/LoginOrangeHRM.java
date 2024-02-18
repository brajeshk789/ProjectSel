package day1_10012024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginOrangeHRM {
	
	WebDriver driver;                     //Declare Global variable
	@BeforeSuite              
	public void setUp() throws InterruptedException       
	{
		System.out.println("Executing setup");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	}
	
	@Test
	public void login() throws InterruptedException
	{
		System.out.println("Executing login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		}
	
	
	@Test
	public void logout() throws InterruptedException
	{
		System.out.println("Executing logout");
    	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/child::li[4]/child::a")).click();
	   
		Thread.sleep(2000);
		}	
	
	
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Executing close");
		driver.close();   
	}   
}
