package Selenium_Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionMethod2 {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.joinsuperset.com/");
			
			driver.manage().window().maximize();
			
			System.out.println(driver.manage().window().getPosition());
			
			Point PO = new Point(200, 100);
			
			driver.manage().window().setPosition(PO);
			
			System.out.println(driver.manage().window().getPosition());
			
			Thread.sleep(4000);
			
			driver.close();
		
			
			
			
	}

}
