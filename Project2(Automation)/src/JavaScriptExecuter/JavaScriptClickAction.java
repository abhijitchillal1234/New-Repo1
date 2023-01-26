package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClickAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("HGUGTDKUHIU");
		
		driver.findElement(By.id("pass")).sendKeys("UURESTGOLJLJK");
		
		Thread.sleep(3000);
		
		WebElement Element = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("arguments[0].click()", Element);             //Click action by javascript
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
