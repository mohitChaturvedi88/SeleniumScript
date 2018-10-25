package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void Test1() {
		System.out.println("Test 1 started");
		
		//SoftAssert
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(false, true);
		
		System.out.println("Test 1 Completed");
		assertion.assertAll();
		
	}
	
	@Test
	public void Test2() {
		System.out.println("Test 2 started");
		
		//Hard Assert
		Assert.assertEquals(false, true);
	
		System.out.println("Test 2 Completed");
		
		
	}

}
