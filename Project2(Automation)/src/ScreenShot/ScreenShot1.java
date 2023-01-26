package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
	
	//TakeScreenShot-----(Without using "Make" method which is present in "randomstring")
	          //Disadvantage is----if we not use Make method the we require to change name of screenshot page every time

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	System.out.println(Source);                                               //it will take screenshot & store it is in local memory
		
		Thread.sleep(2000);
		
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\Sample.jpg");   //it is destination of screenshot memory
		
		FileHandler.copy(Source, Dest);                                       //it will store screenshot in destination
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
