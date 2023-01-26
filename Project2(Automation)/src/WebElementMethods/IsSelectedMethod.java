package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Is Selected Method
//This method is used to show the selected value
      //if it is selected it return true.
      //if it is not selected it return false.

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");		
			
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.facebook.com/");
         
         driver.manage().window().maximize();
         
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
         
         Thread.sleep(2000);
         
         boolean b =  driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).isSelected();
		 System.out.println(b);
		 
		 Thread.sleep(2000);
		 
		 boolean b1 = driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).isSelected();
		 System.out.println(b1);
		
		 Thread.sleep(2000);
		 
		 driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
