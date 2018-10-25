package com.AutoIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fpreferences%2Fsubscriptions%2Fyour-subscriptions%2Fbrowse-all-subscriptions%3F_encoding%3DUTF8%26path%3D%252Fpreferences%252Fsubscriptions%252Fyour-subscriptions%252Fbrowse-all-subscriptions%26useRedirectOnSuccess%3D1");
		driver.findElement(By.linkText("Privacy Notice")).click();
		
		Set<String> list=driver.getWindowHandles();
		
		List<String> windowslist =new ArrayList<String>(list);
		
		driver.switchTo().window(windowslist.get(1));
		driver.findElement(By.linkText("Interest-Based Ads policy")).click();
		
Set<String> list1=driver.getWindowHandles();
		
		List<String> windowslist1 =new ArrayList<String>(list1);
		
		
		driver.switchTo().window(windowslist1.get(2));
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(windowslist1.get(1));
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(windowslist1.get(0));
		Thread.sleep(5000);
		driver.close();
		
		/*
		Set<String> allwindows = driver.getWindowHandles();
		
		List<String> windowslist = new ArrayList<String>(allwindows); 
		
		//System.out.println(windowslist.size());
		
		if(!(windowslist.get(0) == windowslist.get(1))) {
			
			driver.switchTo().window(windowslist.get(1));
			
			
		}else
		{
			System.out.println(windowslist.get(1));
		}
		
		for(String a:windowslist) {
			System.out.println(a);
		}*/
		
		//driver.quit();
	}

}
