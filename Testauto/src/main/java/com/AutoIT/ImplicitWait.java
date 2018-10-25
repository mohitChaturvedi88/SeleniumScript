package com.AutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//implicit wait works on the DOM level, it waits to load all the page elements.
		//it's dynamic wait so it doen't wait for all given time, it waits only unit all the page elemets are not vsible/
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fpreferences%2Fsubscriptions%2Fyour-subscriptions%2Fbrowse-all-subscriptions%3F_encoding%3DUTF8%26path%3D%252Fpreferences%252Fsubscriptions%252Fyour-subscriptions%252Fbrowse-all-subscriptions%26useRedirectOnSuccess%3D1");

		driver.quit();
		
	}

}
