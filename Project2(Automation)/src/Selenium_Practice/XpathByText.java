package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.joinsuperset.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@autocomplete=\"off\"]")).sendKeys("abhijitchillal2829@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Abhijit123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()=\"Forgot password?\"]")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
