package com.TestNGAnnotatiosns;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametarization {

	@Parameters ({"test_param"})
	@Test
	void Mohit(String param) {
		System.out.println(param);
	}
	
}
