package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot4 {

	public static void main(String[] args) throws IOException {

	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
		   	WebDriver driver = new ChromeDriver();
			
		   	driver.get("https://www.facebook.com/");
		   	
	  	    WebElement Screen = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
			
			 driver.manage().window().maximize();
			 
			 File Source = ((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);
			 
			 String Random = RandomString.make(7);
			 
			 String Imagename = "ScreenShot";
			 
			 File Dest = new File("C:\\Users\\Ramesh\\Desktop\\Abhijit\\eclipse\\Project2(Automation)\\src\\ScreenShot\\ScreenShots\\"+Imagename+""+Random+".jpg");
			 
			 FileHandler.copy(Source, Dest);
			 
			 driver.quit();
			 
			 
			 
			 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
