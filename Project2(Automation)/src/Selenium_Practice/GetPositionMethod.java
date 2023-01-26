package Selenium_Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/");
		
		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
		
		Point PO = new Point(100, 300);
		
		driver.manage().window().setPosition(PO);
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.quit();
		
		
		
		
	}

}
