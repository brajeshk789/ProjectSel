package day4_17012024;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class ListenerTest implements ITestListener   //right click on ITestListener and click OpenDeclaration
{
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution on Test started");
		
	  }

	  
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method is passed:"+result.getName());
	  }

	 
	   
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method is failed"+result.getName());
	  }

	 
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method is skipped"+result.getName());
	  }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test method is failed with %:"+result.getName());
	  }

	  
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	public void onStart(ITestContext context) {
	    
		System.out.println("Test Execution started"); //Context means if we want to execute something on start and on finish
	  }

	  
	public void onFinish(ITestContext context) {
	    
		System.out.println("Test Execution ended");
	  }
	
	}


