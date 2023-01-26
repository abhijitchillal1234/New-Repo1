package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Xpath By Index
//Syntax::(//tagname[@attributname="attributvalue"])[index]

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//div[@class=\"xtXmba\"])[2]")).click();           //----------------Xpath By Index
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=\"Current Location\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()=\"Snacks & Beverages\"]")).click();
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//div[text()=\"Personal &  Baby Care\"]")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("atta");
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
