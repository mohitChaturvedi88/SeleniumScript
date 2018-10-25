package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Class Level Implementation
//@Listeners (com.testng.TestNGListeners.class)
public class ListnersDemoTests {

	
	WebDriver driver;
	@BeforeClass
	public void Openbrowser(){
		
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
      }
	
	
	@Test
	public void GoogleTitleVerify()
	{
		String title= driver.getTitle();
		Assert.assertTrue(title.contains("Google"));
		System.out.println("Test Executed");
		
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
}
