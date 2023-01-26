package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorss {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Mumbai");               //-----Attribute
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class=\"sc-eKZiaR caGbXw\"])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class=\"sc-gVyKpa ebdoCp\"])[1]")).click();              //--------Index
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class=\"sc-eKZiaR bXBnrZ\"]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()=\"Plays\"]")).click();                              //----------Text
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sports\")]")).click();                  //contains by text
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class=\"sc-eKZiaR bXBnrZ\"]")).click();
		
		Thread.sleep(4000);
		
		driver.quit();                          
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
