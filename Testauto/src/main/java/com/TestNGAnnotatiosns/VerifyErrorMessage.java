package com.TestNGAnnotatiosns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyErrorMessage {

	WebDriver driver;
	@BeforeClass
	public void Openbrowser(){
		
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
      }
	
	@Test
	public void VerifyError() {
		driver.findElement(By.className("CwaK9")).click();
		String error = driver.findElement(By.className("LXRPh")).getText();
		
		//Type 1
		//Assert.assertEquals(error, "Enter an email or phone number");
		
		//Type 2
		Assert.assertTrue(error.contains("Enter an email or phone number"));
		
		System.out.println("========================Test Completed============================");

		driver.close();
	}
	
 }
