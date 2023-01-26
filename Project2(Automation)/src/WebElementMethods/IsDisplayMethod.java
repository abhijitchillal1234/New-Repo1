package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Is Display Method
//This method is used to know that page is displayed or not

public class IsDisplayMethod {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");		
			
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.facebook.com/");
         
         driver.manage().window().maximize();
         
         Thread.sleep(2000);		
         
         driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
         
         Thread.sleep(2000);
         
         boolean b = driver.findElement(By.xpath("//div[text()=\"Sign Up\"]")).isEnabled();
         System.out.println(b);
         
         boolean b1 = driver.findElement(By.xpath("//div[@class=\"_3ixn\"]")).isDisplayed();
		 System.out.println(b1);
		
		 driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
