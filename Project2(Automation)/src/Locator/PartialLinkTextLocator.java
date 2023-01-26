package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Partial lLink Text Locator
//Syntax::driver.findElement(By.partiallinktext("Partial Text Value"))
//In that we can add patial value of link

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/login/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("email")).sendKeys("abhijitchillal2829@gmail.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.partialLinkText("Forgott")).click();
			
			Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
