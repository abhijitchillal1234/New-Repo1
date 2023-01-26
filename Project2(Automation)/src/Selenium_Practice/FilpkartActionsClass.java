package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FilpkartActionsClass {

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement Element = driver.findElement(By.xpath("//a[text()=\"Login\"]"));
		
		Actions AC = new Actions(driver);
		
		AC.moveToElement(Element).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()=\"Electronics\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement Element1 = driver.findElement(By.xpath("//span[@class=\"_2I9KP_\"]"));
		
		AC.moveToElement(Element1).perform();
		
		Thread.sleep(2000);
		
		WebElement Element2 = driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[2]"));
		
		AC.moveToElement(Element2).perform();
		
		Thread.sleep(2000);
		
		WebElement Element3 = driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[3]"));
		
		AC.moveToElement(Element3).perform();
		
		Thread.sleep(2000);
		
		WebElement Element4 = driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[4]"));

		AC.moveToElement(Element4).perform();
		
		Thread.sleep(2000);
		
		WebElement Element5 = driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[5]"));
		
		AC.moveToElement(Element5).perform();
		
		Thread.sleep(2000);
		
		WebElement Element6 = driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[6]"));
		
		AC.moveToElement(Element6).perform();
		
		Thread.sleep(2000);
	
		driver.quit();
		
	}

}
