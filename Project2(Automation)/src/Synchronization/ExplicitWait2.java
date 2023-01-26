package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {
	
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
		
		By input1 = By.id("src");
		
		By input2 = By.id("dest");
		
		Waitforelement(driver, input1, 15).sendKeys("RSDCUYGIKUH");   //By using explicit wait ew are adding different time for different element by specified time is used only for specied element only
		
		Waitforelement(driver, input2, 20).sendKeys("FDYTRSXRESF");
		
		
		
	
	}
	
	public static WebElement Waitforelement(WebDriver driver , By Locator , int timeout) {
		
		WebDriverWait Mywait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		Mywait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		
		return driver.findElement(Locator);
	
	}

}
