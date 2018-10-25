package com.AutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		
		act.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
		act.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		
		driver.close();
		
	}

}
