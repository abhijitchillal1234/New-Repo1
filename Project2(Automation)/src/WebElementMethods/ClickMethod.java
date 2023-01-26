package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Click Method
//This method is used to click on link etc.


public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");		
			
           WebDriver driver = new ChromeDriver();
           
           driver.get("https://www.facebook.com/");
           
           driver.manage().window().maximize();
           
           Thread.sleep(2000);
           
           driver.findElement(By.id("email")).sendKeys("Abhijit");
           
           Thread.sleep(2000);
           
           driver.findElement(By.id("pass")).sendKeys("Abhijit");
           
           Thread.sleep(2000);
           
           driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();  //------------------------Click Method
           
		   Thread.sleep(4000);
		   
		   driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
