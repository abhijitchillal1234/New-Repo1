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

public class ScreenShot8 {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groww.in/login");
		
		driver.manage().window().maximize();
		
		WebElement A = driver.findElement(By.xpath("//img[@class=\"lls723LoginImg\"]"));
		WebElement B = driver.findElement(By.xpath("//div[@class=\"lc723RightDiv\"]"));
		WebElement C = driver.findElement(By.xpath("//div[@class=\"col l12\"]"));
		WebElement D = driver.findElement(By.xpath("//div[text()=\"Welcome to Groww\"]"));
		WebElement E = driver.findElement(By.xpath("//div[@class=\"col l12 lils382OtherEmail\"]"));
		
		
		ScreenShot(A);
		ScreenShot(B);
		ScreenShot(C);
		ScreenShot(D);
		ScreenShot(E);
		
		driver.quit();
		
		
		
		
		
	}
	
	public static void ScreenShot(WebElement W) throws IOException {
		
		File Source = ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make();
		
		String Imagename = "Grww";
		
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(Source, Dest);
		
	}

}
