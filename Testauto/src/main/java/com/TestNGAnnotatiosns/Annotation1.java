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

public class Annotation1 {

	@BeforeSuite
	void BeforeSuite() {
		
		System.out.println("I am Before Suite Annotaion1.");
	}
	
	@BeforeTest
	void BeforeTest() {
		
		System.out.println("I am Before Test Annotaion1.");
	}
	

	@BeforeClass
	void BeforeClass() {
		
		System.out.println("I am Before Class Annotaion1.");
	}
	
	
	@BeforeMethod
	void BeforeMethod() {
		
		System.out.println("I am Before Method Annotaion1.");
	}
	
	@Test
	void TestMethod1() {
		
		System.out.println("I am Simple Test Method 1 Annotaion1..");
	}
	
	@Test
	void TestMethod2() {
		
		System.out.println("I am Simple Test Method 2 Annotaion1..");
	}
	
	@AfterMethod
	void AfterMethod() {
		
		System.out.println("I am After Method Annotaion1.");
	}

	@AfterClass
	void AfterClass() {
		
		System.out.println("I am After Class Annotaion1.");
	}
	
	@AfterTest
	void AfterTest() {
		
		System.out.println("I am After Test Annotaion1.");
	}
	
	@AfterSuite
	void AfterSuite() {
		
		System.out.println("I am After Suite Annotaion1.");
	}
}

