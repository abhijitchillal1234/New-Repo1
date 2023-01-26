package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Name Locator
//Syntax::driver.findElement(By.name("namevalue"));


public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("AWERTY");
		
		driver.findElement(By.name("pass")).sendKeys("SDFGH");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
