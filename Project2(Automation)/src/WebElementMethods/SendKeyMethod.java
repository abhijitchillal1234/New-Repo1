package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




//SendKey Method
//By using this method we can inport data

public class SendKeyMethod {

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
		
                     driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
