package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener{
	
	  @Override
	    public void onStart(ITestContext context) {
//	        System.out.println("Test execution started: " + context.getName());
		  System.out.println("Test execution is started");   //it will execute only once before starting all the tests
	    }
	  
	  @Override
	    public void onTestStart(ITestResult result) {
//	        System.out.println("Test started: " + result.getName());
		  System.out.println("Test Execution is started....");  //it will be executed for each test
	    }


	    @Override
	    public void onTestSuccess(ITestResult result) {
//	        System.out.println("Test passed: " + result.getName());
	    	System.out.println("Test is passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
//	        System.out.println("Test failed: " + result.getName());
	    	System.out.println("Test is failed");
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
//	        System.out.println("Test skipped: " + result.getName());
	    	System.out.println("Test is skipped");
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        System.out.println("Test failed but within success percentage: " + result.getName());
	    }

	  

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("Test execution finished: " + context.getName());
	    }
	}

