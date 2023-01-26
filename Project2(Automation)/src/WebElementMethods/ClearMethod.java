package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Clear Method
//This method is used to clear previous record.

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");		
			
           WebDriver driver = new ChromeDriver();
           
           driver.get("https://www.facebook.com/");
           
           driver.manage().window().maximize();
           
           Thread.sleep(2000);
           
           WebElement Email = driver.findElement(By.id("email"));
           
           Email.sendKeys("Abhijit");
           
           Thread.sleep(2000);
           
           Email.clear();
           
           Thread.sleep(2000);
           
           Email.sendKeys("Abhijit");
           
           Thread.sleep(2000);
           
           Email.clear();
  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
