package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) throws InterruptedException {

	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			//Step -2
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//Step -3
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
	         Thread.sleep(3000);
	         
	         System.out.println(driver.manage().window().getSize());
	                                        
	                                        // W   H
	         Dimension Size =  new Dimension(700, 800);
	     
	         driver.manage().window().setSize(Size);
	         
	         Thread.sleep(10000);
	         
	         System.out.println(driver.manage().window().getSize());    
	         
	         driver.quit();
	         
	}


}
