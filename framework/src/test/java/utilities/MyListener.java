package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class MyListener implements ITestListener {
	
	ExtentReports e;
	ExtentTest t;
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started");
	}
	
public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case passed");
	}
	
public void onTestFailure(ITestResult result) {
	
	System.out.println("Test case failed");
}

public void onTestSkipped(ITestResult result) {
	
	System.out.println("Test case skipped");
}

public void onStart(ITestContext context) {
	
	System.out.println("TestNG started");
	
	/*e = new ExtentReports();
	File file = new File("report1.html");
	e.StartTest("LoginTest has started");
	e.addSystemInfo("Browser","Chrome");
	e.addSystemInfo("Build","Chrome");
	*/
}

public void onFinish(ITestContext Context) {
	
	System.out.println("TestNG started");
}



}
