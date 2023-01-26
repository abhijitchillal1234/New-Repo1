package Selenium_Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section2Practice1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("src")).sendKeys("Delhi");
		
	    Thread.sleep(5000);
		
		String From = "//ul[@class=\"autoFill homeSearch\"]//li";
		
		List(From, "Delhi");
		
		Thread.sleep(8000);
		
	    driver.findElement(By.id("dest")).sendKeys("Mumbai");
	    
	    Thread.sleep(4000);
	    
	    String To = "//ul[@class=\"autoFill homeSearch\"]//li";
	   
	    List(To, "Parel, Mumbai");

	    Thread.sleep(8000);
	    
	    driver.findElement(By.xpath("//div[@class=\"fl search-box date-box gtm-onwardCalendar\"]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("search_btn")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
	        	
	    	
	    }
	
	public static void List(String S , String S1) {
		
         List<WebElement> List2 = driver.findElements(By.xpath(S));		
         System.out.println(List2.size());
         
         for(int c=0;c<List2.size();c++) {
        	 
        	 System.out.println(List2.get(c).getText());
        	 
        	 if(List2.get(c).getText().equals(S1)) {
        		 
        		 List2.get(c).click();
        	 }
        	 
         }
	}
	

	    
	    
	    
	    
	    
	    
	    
	    
		}
		
	  
		
	
	
	
		
		
		
	


