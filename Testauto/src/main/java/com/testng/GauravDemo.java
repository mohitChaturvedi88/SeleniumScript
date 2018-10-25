package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class GauravDemo implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("My test Failed");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("My test Skipped");
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("My test Started");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("My test Successed");
		
	}

	
	
}
