package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {
	
	//Single Iframe-----------------------------------
	//Syntax for iframe-----------------
	    //driver.switchTo().frame("By id or class or webelement")

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("singleframe");                           //iframe
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("JavaScript Tutorial");
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();          //it is used to return the main page again or to move from iframe to main page
		
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
