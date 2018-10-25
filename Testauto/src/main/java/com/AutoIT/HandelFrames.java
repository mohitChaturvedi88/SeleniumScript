package com.AutoIT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelFrames {

	public static void main(String[] args) {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D://Learn//drivers//chromedriver.exe");

		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		/*driver.findElement(By.name("username")).sendKeys("MohitCh");
		driver.findElement(By.name("password")).sendKeys("mohitjichrome");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).submit();
		*/
		/*List<WebElement> framelist = driver.findElements(By.tagName("iframe"));
		
		System.out.print(framelist.size());
*/
		
		//driver.switchTo().frame("mainpanel");
		/*driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		driver.switchTo().defaultContent();
		driver.quit();*/

		
		List<WebElement> iframno = driver.findElements(By.tagName("iframe"));
		
		int size = iframno.size();
		System.out.println(size);
		driver.switchTo().frame(0);
		driver.findElement(By.name("firstname")).sendKeys("Mohit");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("IF2");
		WebElement imageElement = driver.findElement(By
				.xpath("//*[@id='post-9']/div/div[1]/div/p[1]/a/img"));
 
		imageElement.click();
		System.out.println("Switching successfull");
		
		
	}

}
