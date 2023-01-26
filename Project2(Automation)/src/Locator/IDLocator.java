package Locator;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


                                         //ID Locator-----------------
                                            //Syntax::driver.findElement(By.id("IDValue"))
                                                //        RV.Methodname(Class.Methodname)

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {

      	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("src")).sendKeys("Wakad, Pune");                          //-----------------ID Locator
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Solapur");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class=\"fl icon-calendar_icon-new icon-onward-calendar icon\"]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[text()=\"Search Buses\"]")).click();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
