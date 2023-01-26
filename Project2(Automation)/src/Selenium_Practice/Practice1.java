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

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement A = driver.findElement(By.xpath("//div[@class=\"CxRgyd\"]"));
		WebElement B = driver.findElement(By.xpath("//div[@jsname=\"USBQqe\"]"));
		WebElement C = driver.findElement(By.xpath("//div[@jsname=\"WjL7X\"]"));
		WebElement D = driver.findElement(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[2]"));

		Screenshot(A);
		Screenshot(B);
		Screenshot(C);
		Screenshot(D);
		
		driver.quit();
		
		
		}
	
	public static void Screenshot(WebElement W ) throws IOException {
		
		File Source = ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(6);
		
		String Imagename = "Method";
		
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(Source, Dest);
		
		
	}

}
