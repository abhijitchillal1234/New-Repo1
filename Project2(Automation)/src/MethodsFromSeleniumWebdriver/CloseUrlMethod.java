package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Close Url Method----
//It Closes The Currently Opened Url Page Only(Attach Open Zalela Url Close Carnyasathi Close Url Method Used)


public class CloseUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		
	//Step--1
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
	//Step--2
		
		WebDriver driver = new ChromeDriver();
		
	//Step--3
		
		driver.get("https://www.amazon.in/");
		
	    Thread.sleep(5000);                               //It is used to stop page for some time before closing. 
		
		driver.close();
		
		
		
		
		

	}

}
