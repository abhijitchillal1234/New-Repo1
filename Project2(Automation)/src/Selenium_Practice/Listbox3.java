package Selenium_Practice;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Listbox3 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apple.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Continue\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()=\"Store\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
