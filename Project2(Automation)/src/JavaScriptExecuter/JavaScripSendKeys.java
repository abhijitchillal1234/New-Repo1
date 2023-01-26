package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//First Way------------->>>>>>>>>>>>>
		
/*		JS.executeScript("document.getElementByID('email').value='Rohit';");     //sendkey by javascript executer
		
		JS.executeScript("document.getElementByID('pass').value='Patil';");      //sendkey by javascript executer             
		
		Thread.sleep(3000);
		
		driver.quit();                */
		
        WebElement Username = driver.findElement(By.id("email"));
		
        WebElement Password = driver.findElement(By.id("pass"));
		
		Thread.sleep(3000);
		
	   //Second Way------------->>>>>>>>>>>>>
		
		JS.executeScript("arguments[0].value='Avinash';", Username);             //sendkey by javascript executer
		
		JS.executeScript("arguments[0].value='More'", Password);                 //sendkey by javascript executer
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
