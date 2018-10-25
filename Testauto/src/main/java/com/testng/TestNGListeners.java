package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed and details are" + result);
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped and details are" + result);
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test case Started and details are" + result);
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Success Hurrrey and details are" + result);
		
	}

}
