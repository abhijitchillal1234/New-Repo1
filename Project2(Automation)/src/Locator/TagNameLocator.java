package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TagName Locator
//Syntax::driver.findElement(By.tagname("tagname"))
//If we use tagname locator it will take by default 1st tagname only everytimne

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("input")).sendKeys("Abhijit");
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("input")).sendKeys("Chillal");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
