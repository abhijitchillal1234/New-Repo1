package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

       //Multiple ScreenShot handle using method-------------------------

public class ScreenShot6 {
	
	static File Source;   
	
	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement A = driver.findElement(By.xpath("//h1[@id=\"headingText\"]"));
		WebElement B = driver.findElement(By.xpath("//span[text()=\"Use your Google Account\"]"));
		WebElement C = driver.findElement(By.xpath("//div[@jsname=\"f2d3ae\"]"));
		WebElement D = driver.findElement(By.xpath("//button[text()=\"Forgot email?\"]"));
		
		ScreenShot(A);
		ScreenShot(B);
		ScreenShot(C);
		ScreenShot(D);
		
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
	}
	
	public static void ScreenShot(WebElement W) throws WebDriverException, IOException {
		
		Source = ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make();
		
		String Imagename = "Method";
		
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(Source, Dest);
		
		
		
	}

}
