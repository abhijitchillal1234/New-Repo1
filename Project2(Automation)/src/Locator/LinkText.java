package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//LinkTerxt Locator
//Syntax::driver.findElement(By.linktext("TextValue"))

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/login/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("email")).sendKeys("abhijitchillal2829@gmail.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Forgotten account?")).click();
			
			Thread.sleep(3000);
			
			
			
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
