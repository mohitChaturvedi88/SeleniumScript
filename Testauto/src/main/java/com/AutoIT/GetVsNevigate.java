package com.AutoIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNevigate {

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.santabanta.com/");
		
		//get method waits until the loads all the element of the web pages.
		driver.navigate().to("http://www.santabanta.com/");
		//Navigate method does't wait to load all the web elements of the web page.
		//we also can use back(), farword(), refresh() methods with navigate
		
	
	}

}
