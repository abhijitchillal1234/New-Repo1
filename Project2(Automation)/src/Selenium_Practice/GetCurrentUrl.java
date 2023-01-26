package Selenium_Practice;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/");
		
	    System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);

		String Actual = driver.getCurrentUrl();
		
		String Expected = "https://twitter.com/";
		
		if (Expected.equals(Actual)) {
			
			System.out.println("Currect Url");
		}
		else {System.out.println("Wrong Url");}
		
		driver.quit();
		
		
		
		

		
	
	
	}

}
