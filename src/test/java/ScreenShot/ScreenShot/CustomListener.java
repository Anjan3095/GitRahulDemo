package ScreenShot.ScreenShot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener{

	

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Failed Test");
	failed(result.getMethod().getMethodName());
	}

	

}