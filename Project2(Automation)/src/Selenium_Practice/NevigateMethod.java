package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateMethod {

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.joinsuperset.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			driver.get("https://mail.google.com/");
			
			Thread.sleep(4000);
			
			driver.navigate().back();
			
			Thread.sleep(4000);
			
			driver.navigate().forward();
			
			Thread.sleep(4000);
			
			driver.navigate().refresh();
			
			driver.close();
			
			

	}

}
