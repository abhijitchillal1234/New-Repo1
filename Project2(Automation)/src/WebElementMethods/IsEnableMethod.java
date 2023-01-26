package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Is Enabled Method
//It is used to know the button is enabled (It retuirn the value in boolean)

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");		
			
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.facebook.com/");
         
         driver.manage().window().maximize();
         
         Thread.sleep(2000);
         
         boolean b1 = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).isEnabled();
         System.out.println(b1);
         
         driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
         
         Thread.sleep(2000);
         
         boolean b =  driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).isEnabled();
		 System.out.println(b);
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
