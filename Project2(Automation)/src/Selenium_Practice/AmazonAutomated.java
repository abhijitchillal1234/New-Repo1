package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomated {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"nav-sprite hmenu-close-icon\"]")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt=\"Starting ₹6,999\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class=\"a-size-base-plus a-color-link octopus-pc-card-title-seeMore\"])[1]")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]")).click();
		
//		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("redmi note1");
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[contains(text(),\"Redmi Note 11 (Horizon Blue, 4GB RAM, 64GB Storage) | 90Hz FHD+ AMOLED Display | Qualcomm® Snapdragon™ 680-6nm | 33W Charger Included | Get 2 Months of YouTube Premium Free!\")]")).click();
        
        driver.findElement(By.xpath("(//input[@name=\"submit.buy-now\"])[2]")).click();
		
        
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
