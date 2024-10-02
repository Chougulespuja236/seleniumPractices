package seleniumpractices;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImpl implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started");
		Reporter.log("Test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success");		
		Reporter.log("Test case success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");		
		Reporter.log("Test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
		Reporter.log("Test case skipped");
			
	}

	
}
