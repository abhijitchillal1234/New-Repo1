package Selenium_Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.joinsuperset.com/");
			
			Point P = new Point(400, 500);
			
			driver.manage().window().setPosition(P);
			
			Thread.sleep(4000);
			
			driver.close();
			
			
	}

}
