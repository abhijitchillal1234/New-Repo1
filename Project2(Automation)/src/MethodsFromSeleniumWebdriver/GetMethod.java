package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Get Method---
//By using this method we are open application or open url.


public class GetMethod {


		public static void main(String[] args) throws InterruptedException {
            
			//Step--1
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			//Step--2
			
			WebDriver driver = new ChromeDriver();
			
			//Step--3
			
			driver.get("https://www.amazon.in/");
			
		//	driver.get("https://www.amazon.in/Home-Kitchen/b/?ie=UTF8&node=976442031&ref_=nav_cs_home");
			
			Thread.sleep(5000);                          //It is used to stop page before closing.
			
			driver.close();
		

	}

}
