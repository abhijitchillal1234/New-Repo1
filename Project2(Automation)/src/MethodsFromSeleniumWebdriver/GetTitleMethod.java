package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Get Title Method-----
//It is used to get title.
//Compaire those title with customers requirenment by using .equals method.


public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {

		//Step--1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		//Step--2
		WebDriver driver = new ChromeDriver();
		
		//Step--3
        driver.get("https://www.amazon.in/"); 
		
        String Expected="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        
	    String Title = driver.getTitle();
	        {System.out.println(Title);}
	        
	        if (Expected.equals(Title)) {
	        	
	        	System.out.println("Correct Title");
	        }
	        else {System.out.println("Incorrect Title");}
	        
	        
	   Thread.sleep(2000);
	   
	   driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
