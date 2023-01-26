package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();                     //attribute
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"nav-sprite hmenu-close-icon\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[1]")).click();                         //index
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()=\"Best Sellers\"])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();                         //text
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();        //contains by attribute
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),\"Customer\")])[1]")).click();           //contains by text
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
