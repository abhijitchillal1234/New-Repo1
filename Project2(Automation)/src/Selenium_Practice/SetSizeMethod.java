package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/");

		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(3000);
		
		Dimension D = new Dimension(4000, 6000);
		
	    driver.manage().window().setSize(D);
	    
	    Thread.sleep(3000);
	    
	    System.out.println(driver.manage().window().getSize());
		
		Point PO = new Point(300, 400);
		
		driver.manage().window().setPosition(PO);
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
