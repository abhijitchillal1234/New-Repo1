package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightLightBorder3 {
	
	//Hightlight multiple border using method----------------------------

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement CNA = driver.findElement(By.xpath("//a[contains(@id,\"u_0_\")]"));
		
		HightLight(CNA, driver);
		
		Thread.sleep(2000);
		
		CNA.click();
		
		Thread.sleep(2000);

		WebElement Logo2 = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));

		WebElement Logo3 = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));



		HightLight(Logo2, driver);
		HightLight(Logo3, driver);
		
		Thread.sleep(3000);
		
		driver.quit();
			
	}
	
	public static void HightLight(WebElement Element , WebDriver driver) {
		
	     JavascriptExecutor JS = (JavascriptExecutor) driver;
	     
	     JS.executeScript("arguments[0].style.border='10px solid Red'", Element);
	     
	     JS.executeScript("arguments[0].style.background='Black'", Element);
	}

}
