package Locator;

                             //Xpath by attributes--------  
                                   //Synatx::tagname[@attributename="attribute value"]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.instagram.com/");
			
	    	driver.manage().window().maximize();
		
	    	Thread.sleep(4000);
	    	
	    	driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys("abhijitchillal2829@gmail.com");
	    	
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.xpath("//input[@class=\"_aa4b _add6 _ac4d\"]")).sendKeys("Abhijit123");
	    	
	    	Thread.sleep(4000);
	    	
	    	driver.findElement(By.xpath("//button[@class=\"_acan _acao _acat\"]")).click();
	    	
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.xpath("//div[@class=\"_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm\"]")).click();
	    	
	    	driver.quit();
			
	}

}
