package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Set Size Method------
//for set size method we can create dimention class & dimention object.

public class Dimentation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension DO = new Dimension(700,900);
		
        driver.manage().window().setSize(DO);
        
        Thread.sleep(2000);
        
        driver.quit();
       
		

		
		

	}

}