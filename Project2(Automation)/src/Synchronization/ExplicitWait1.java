package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {
	
	//ExplicitWait1------------
	//it is not declare globally because it apply for single element only
	//if the element is found quickly than it ignore the next sec/min etc. (Thread is not ignoring those sec/min).
	//if the element is not found in that specified time period than it thows the execption
	//Syntax:::
	      //WebDriverWait Mywait = new WebDriverWait(driver , Duration.ofseconds(20));
	      //MyWait.until(ExpectedConditions.visibilityofElementLocated(By.xpath("")));

	public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebDriverWait Mywait = new WebDriverWait(driver, Duration.ofSeconds(15));                      
		
		WebElement Element = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		Element.sendKeys("Pune");
		
		WebElement Element1 = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
		Element1.sendKeys("Mumbai");
		
		
		
		
		
		
		
	}

}
