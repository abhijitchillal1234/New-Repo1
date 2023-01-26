package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dunzo.com/pune");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()=\"SET LOCATION\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()=\"Use current location\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()=\"Set location\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()=\"Sign in\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("7775092608");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@class=\"sc-fzozJi jxgYyd\"]")).click();		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()=\"Send OTP\"]")).click();
		
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
