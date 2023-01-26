package Selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/browser-windows");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("windowButton")).click();
			
			Set<String> data = driver.getWindowHandles();
			
	        Iterator<String> it = data.iterator();
	        
	        String parent = it.next();
	        System.out.println(parent);
	        String child = it.next();
	        System.out.println(child);
	        
	        driver.switchTo().window(child);
	        
	        Thread.sleep(2000);
	        
	        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	        
	        Thread.sleep(2000);
	        
	        driver.switchTo().window(parent);
	        
	        System.out.println(driver.getTitle());
	        
	        driver.quit();
	        
	        
           
          
            
            
            
	}

}
