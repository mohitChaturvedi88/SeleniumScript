package com.testng;

import org.testng.annotations.Test;

//@Listeners(com.testng.GauravDemo.class)
public class ClassLevelListners {
	
	@Test
	public void Test1() {
		System.out.println("Test 1 Executing");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test 2 Executing");
	}
	
	@Test
	public void Test3() {
		System.out.println("Test 3 Executing");
	}
}
