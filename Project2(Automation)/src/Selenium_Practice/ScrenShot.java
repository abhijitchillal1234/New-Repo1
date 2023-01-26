package Selenium_Practice;

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

public class ScrenShot {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(1000);
		
	WebElement A = driver.findElement(By.xpath("(//div[@id=\"container\"])[2]"));
	WebElement B = driver.findElement(By.xpath("//ytd-rich-grid-renderer[@class=\"style-scope ytd-two-column-browse-results-renderer\"]"));
		
	ScreenShot(A);
	ScreenShot(B);
	
		driver.quit();
		
		
	}
	
	public static void ScreenShot(WebElement W) throws IOException {
		
	File Source = ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
	
	String Random = RandomString.make(3);
	
	String Imagename ="YYYYYYYYYY";
	
	File Dest = new File("‪C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
	
	FileHandler.copy(Source, Dest);
	
	
	
	
	}
	

}
