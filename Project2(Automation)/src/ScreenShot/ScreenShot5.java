package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot5 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement Screen = driver.findElement(By.xpath("//div[@jsname=\"f2d3ae\"]"));
		
		Thread.sleep(2000);
		
		File Source =((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(5);
		
		String Imagename = "Gmail";
		
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
		
	//	File Dest1 = new File ("C:\\Users\\Ramesh\\Desktop\\Abhijit\\eclipse\\Project2(Automation)\\src\\ScreenShot\\ScreenShots\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(Source, Dest);
		
	//	FileHandler.copy(Source, Dest1);
		
		driver.quit();
		
		
		
		
		
	}

}
