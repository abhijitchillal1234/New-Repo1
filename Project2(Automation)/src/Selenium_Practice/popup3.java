package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup3 {

	public static void main(String[] args) throws InterruptedException {

             ChromeOptions option = new ChromeOptions();
		
	       	option.addArguments("--disable-notifications");

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.hdfcbank.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			
			
	}

}
