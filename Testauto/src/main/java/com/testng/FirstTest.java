package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test (priority = 1, description ="This case will run at 3rd no")
	void a()
	{
		System.out.println("A");
		Assert.assertEquals("Hi", "Hello");
	}
	
	@Test (priority = 3, description ="This case will run at 4rd no")
	void b()
	{
		System.out.println("B");
	}
	
	@Test (priority = 0, description = "This case will run at 2rd no")
	void c()
	{
		System.out.println("C");
	}
	
	@Test (priority = -1, description ="This case will run at 1rd no")
	void d()
	{
		System.out.println("D");
	}
}
