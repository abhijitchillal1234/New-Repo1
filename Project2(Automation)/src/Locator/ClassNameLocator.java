package Locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//ClassName Locator
//Syntax:: driver.findElement(By.classname("ClassName"))

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {

	 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://login.yahoo.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.className("phone-no")).sendKeys("AFGHHJN");
			
			Thread.sleep(3000);
			
			driver.quit();
			
			
			
			
             
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
