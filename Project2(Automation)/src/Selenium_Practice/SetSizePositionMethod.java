package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizePositionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.isro.gov.in/"); 
		
		Thread.sleep(5000);
		
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getPosition());
		
		System.out.println(driver.manage().window().getSize());
		
		driver.get("https://www.spacex.com/");
		
		Thread.sleep(5000);
		
		Dimension D = new Dimension(400, 600);
		
		driver.manage().window().setSize(D);
		
		Thread.sleep(5000);
		
		Point P = new Point(400, 600);
		
		driver.manage().window().setPosition(P);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		driver.close();
		
		

	}

}
