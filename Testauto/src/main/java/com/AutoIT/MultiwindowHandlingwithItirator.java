package com.AutoIT;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiwindowHandlingwithItirator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		WebElement openwindow = driver.findElement(By.id("button1"));
		
		for(int i=0; i<3; i++) {
			openwindow.click();
		}
		
		Set<String> windowcount = driver.getWindowHandles();
		System.out.println(windowcount.size());

		Iterator<String> itr = windowcount.iterator();
		
		String w1 =itr.next();
		String w2 =itr.next();
		String w3 =itr.next();
		String w4 =itr.next();
		
		System.out.println(w3);
		Thread.sleep(2000);
		driver.switchTo().window(w3);
		driver.close();
		
		System.out.println(w2);
		Thread.sleep(2000);
		driver.switchTo().window(w2);
		driver.close();
		
		System.out.println(w1);
		Thread.sleep(2000);
		driver.switchTo().window(w1);
		driver.close();
		
		System.out.println(w4);
		Thread.sleep(2000);
		driver.switchTo().window(w4);
		driver.close();
		
		
	}

}
