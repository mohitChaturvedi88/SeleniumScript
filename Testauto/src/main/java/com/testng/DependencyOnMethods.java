package com.testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependencyOnMethods {
	
	@org.testng.annotations.BeforeClass
	void BeforeClass() {
		System.out.println("BeforeClass");
	}
	

	@org.testng.annotations.AfterClass
	void AfterClass() {
		System.out.println("AfterClass");
	}
	
	@BeforeMethod
	void OpenBrowser() {
		System.out.println("OpenBrowser");
	}
	

	@AfterMethod
	void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	
	@Test ( description ="This case will run at 1rd no")
	void StartApp()
	{
		System.out.println("A");
	}
	
	@Test (dependsOnMethods= "StartApp", description ="This case will run at 2rd no")
	void HomeScreen()
	{
		System.out.println("B");
	}
	
	@Test (dependsOnMethods ="HomeScreen", description = "This case will run at 3rd no")
	void BuyArticle()
	{
		System.out.println("C");
	}
	
	@Test (dependsOnMethods="BuyArticle", description ="This case will run at 4rd no")
	void LogOut()
	{
		System.out.println("D");
	}
	
	@Test ( description ="This case will run Before Test Annotation")
	void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
}
