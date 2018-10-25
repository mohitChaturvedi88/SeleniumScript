package com.AutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilicitwait {

	
	public static void main(String[] args) {
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 40);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		boolean status = element.isDisplayed();
		String s = element.getText();
		
		if(status) {
			
			System.out.println(s + " is visible");
			
		}
		else{
			System.out.println(s + "Element is not visible");
		} 
		driver.close();
}
}
