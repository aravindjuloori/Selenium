package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	 public void onStart(ITestContext context) {
		 sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		 sparkReporter.config().setDocumentTitle("Automation Report");
		 sparkReporter.config().setReportName("Functional Tests");
		 sparkReporter.config().setTheme(Theme.DARK);
		 
		 extent=new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 
		 extent.setSystemInfo("Computer name","localhost");
		 extent.setSystemInfo("Environment","QA");
		 extent.setSystemInfo("Tester Name", "Aravind");
		 extent.setSystemInfo("OS","Windows");
		 extent.setSystemInfo("Browser Name","Chrome");
		 
		 
	    }
	 
	  public void onTestSuccess(ITestResult result) {
		  test=extent.createTest(result.getName());  //It will create the test entry in the report
		  test.log(Status.PASS,"Test Case is Passed:" +result.getName());
	    }

	  public void onTestFailure(ITestResult result) {
		  test=extent.createTest(result.getName());
		  test.log(Status.FAIL,"Test Case Failed is :" +result.getName());
		  test.log(Status.FAIL,"Test Case Failed caused is: " +result.getThrowable());
	    }
	  
	  public void onTestSkipped(ITestResult result) {
		  	test=extent.createTest(result.getName());
		  	test.log(Status.SKIP,"Test case Skipped is:"  +result.getName());
	    }
	  
	  public void onFinish(ITestContext context) {
	        extent.flush();
	    }
}
