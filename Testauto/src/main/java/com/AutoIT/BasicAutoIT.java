package com.AutoIT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutoIT {

	public static void main(String[] args) throws IOException {
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		driver= new ChromeDriver(); 

		driver.get("https://www.google.com");
		/*driver.manage().window().maximize();
		driver.findElement(By.id("fileCatImg")).click();*/
		//Runtime.getRuntime().
		
		//Runtime.getRuntime().exec("C:\\Users\\Mohit\\Desktop\\vvv.exe");
		
		//driver.findElement(By.className("btn btn-next btn-fill btn-danger btn-wd")).click();
		
		
	}

}
