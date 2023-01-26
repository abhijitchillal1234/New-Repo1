package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {
	
	//ImplicitWait--------------
	 //it is declare globally to apply all the element from that perticular webdriver
	 //if the element is found quickly than it ignore the next sec/min etc. (Thread is not ignoring those sec/min).
	 //if the element is not found in that perticular time period than it thows the execption
	 //Syntax::driver.manage().timeouts().implicitlyWait(Duration.TimeUnit.sec/min etc.)
	
	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  //Syntax for implicitly wait
		
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("HTGUDCGIJFGUJF");
		
		driver.findElement(By.id("pass")).sendKeys("TEYDDFUJKIUJ");
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
