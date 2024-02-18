package day2_11012024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@Test
public class DataProviderDemoModifiedInOneBrowser 
{
	
	WebDriver driver;
	
	@DataProvider(name ="dataSender")
	public Object[][] mobileType()
	{
		Object[][] dataSet=new Object[3][2];
		dataSet[0][0] = "Oppo";
		dataSet[0][1] ="Reno 2z";
		
		dataSet[1][0] ="iphone";
	    dataSet[1][1] ="15 Pro";
	    
	    dataSet[2][0] ="OnePlus";
	    dataSet[2][1] ="11R";
	    
		return dataSet; 
	}
	
@BeforeSuite
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
}
	
	@Test(dataProvider="dataSender")
	public void flipkartSearchMobile(String brand,String model) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(brand+" "+model);       //Without data providerdriver.findElement(By.name("q")).sendKeys("OnePlus 11R");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[@role='button']")).click();
	}
	
	
	
}
