package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Quite Method Selenium-----
//By using quite method we can closes whole browser i.e all the pages.
//Close method closes only recent page but quite method closes all the pages/whole browser.

public class QuiteMethod {

	public static void main(String[] args) throws InterruptedException {
		

//Step--1)
		
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
 //Step -2
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
//Step -3
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
			
			Thread.sleep(5000);
			
		//driver.close();
			
			driver.quit();
		
		
		
		
		
		
	}

}
