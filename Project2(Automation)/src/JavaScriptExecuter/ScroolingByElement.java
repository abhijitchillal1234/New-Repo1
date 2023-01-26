package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolingByElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com");
		
		Thread.sleep(3000);
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//h1[contains(text(),\"Code Editor\")]"));
		
		JS.executeScript("arguments[0].scrollIntoView();", Element);     //Scrolling by element
		
	   Thread.sleep(5000);
	   
	   driver.quit();
		
		
		
	}

}
