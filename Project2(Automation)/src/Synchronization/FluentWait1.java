package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {

	public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		//Fluent Wait declaration---------------
		//Waiting 30sec. for an element to be present on the page checking for it's present once every 5sec.
		
		Wait<WebDriver> Mywait = new FluentWait<WebDriver>(driver)
		      .withTimeout(Duration.ofSeconds(30))
		      .pollingEvery(Duration.ofSeconds(5))
		      .ignoring(NoSuchElementException.class);
		
		//Usage of fluent wait--------------
		
		WebElement Element = Mywait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				
				return 
						driver.findElement(By.id("src"));
			}
		});
		
		Element.sendKeys("Pune");
		
		
		
		
		
		
		
	}



}
