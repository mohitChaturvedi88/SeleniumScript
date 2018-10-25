package com.TestNGAnnotatiosns;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {

	@BeforeSuite
	void BeforeSuite() {
		
		System.out.println("I am Before Suite Annotaion2.");
	}
	
	@BeforeTest
	void BeforeTest() {
		
		System.out.println("I am Before Test Annotaion2.");
	}
	

	@BeforeClass
	void BeforeClass() {
		
		System.out.println("I am Before Class Annotaion2.");
	}
	
	
	@BeforeMethod
	void BeforeMethod() {
		
		System.out.println("I am Before Method Annotaion2.");
	}
	
	@Test
	void TestMethod1() {
		
		System.out.println("I am Simple Test Method 1 Annotaion2.");
	}
	
	@Test
	void TestMethod2() {
		
		System.out.println("I am Simple Test Method 2 Annotaion2.");
	}
	
	@AfterMethod
	void AfterMethod() {
		
		System.out.println("I am After Method Annotaion2.");
	}

	@AfterClass
	void AfterClass() {
		
		System.out.println("I am After Class Annotaion2.");
	}
	
	@AfterTest
	void AfterTest() {
		
		System.out.println("I am After Test Annotaion2.");
	}
	
	@AfterSuite
	void AfterSuite() {
		
		System.out.println("I am After Suite Annotaion2.");
	}
}
