package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod2 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.joinsuperset.com/");
			
			driver.manage().window().maximize();
			
			System.out.println(driver.manage().window().getSize());
			
			Dimension DO = new Dimension(600, 800);
			
			driver.manage().window().setSize(DO);
			
			System.out.println(driver.manage().window().getSize());
			
			Thread.sleep(4000);
			
			driver.close();

	}

}
