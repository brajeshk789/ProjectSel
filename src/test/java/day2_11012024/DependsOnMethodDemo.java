package day2_11012024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class MainClass
{
	WebDriver driver;
	@Test
	public void setUp() throws InterruptedException
	{
		System.out.println("Executing Setup");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
}



public class DependsOnMethodDemo extends MainClass {
	@Test(dependsOnMethods = ("setUp"))
	public void login() throws InterruptedException
	{
		System.out.println("Executing Login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	
}
