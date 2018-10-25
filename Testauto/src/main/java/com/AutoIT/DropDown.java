package com.AutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com/");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select monthdrop = new Select(month);
		monthdrop.selectByIndex(6);
		Thread.sleep(1000);
		
		monthdrop.selectByValue("9");
		Thread.sleep(1000);
		monthdrop.selectByVisibleText("Mar");
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		

	}

}
