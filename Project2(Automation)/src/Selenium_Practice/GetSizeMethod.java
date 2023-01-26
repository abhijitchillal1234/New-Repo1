 package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension DO = new Dimension(300, 700);
		
		driver.manage().window().setSize(DO);
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}