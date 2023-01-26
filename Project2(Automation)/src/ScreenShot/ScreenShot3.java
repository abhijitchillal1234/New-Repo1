package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot3 {

	public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
	   	WebDriver driver = new ChromeDriver();
		
	   	driver.get("https://groww.in/onboarding");
	   	
	   	driver.get("https://mail.google.com/");
		
		 driver.manage().window().maximize();
		
		 Thread.sleep(2000);
		
		  File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  String Random = RandomString.make(5);
		  
		  String Imagename = "Screenshot";
		  
		  File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShot Of Automated Pages\\"+Imagename+""+Random+".jpg");
		  
		  FileHandler.copy(Source, Dest);
		  
		  Thread.sleep(2000);
		  
		  driver.quit();
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
