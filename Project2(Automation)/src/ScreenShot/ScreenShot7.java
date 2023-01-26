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

public class ScreenShot7 {
	
	static File Source;

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement A = driver.findElement(By.xpath("//div[@class=\"container center\"]"));
		WebElement B = driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]"));
		WebElement C = driver.findElement(By.xpath("//div[@class=\"col-sm-4 col-md-4 col-xs-4\"]"));
		WebElement D = driver.findElement(By.xpath("//form[@id=\"basicBootstrapForm\"]"));
		WebElement E = driver.findElement(By.xpath("(//div[@class=\"form-group\"])[2]"));
		
		
		
		ScreenShot(A);
		ScreenShot(B);
		ScreenShot(C);
		ScreenShot(D);
		ScreenShot(E);
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}
	
	public static void ScreenShot(WebElement W) throws IOException {
		
		 Source = ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
		 
		 String Random = RandomString.make(4);
		 
		 String Imagename = "";
		 
		 File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
		 
		 FileHandler.copy(Source, Dest);
			
	}

}
