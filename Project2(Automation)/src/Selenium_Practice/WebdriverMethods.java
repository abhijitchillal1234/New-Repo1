package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {


	public static void main(String[] args) throws InterruptedException {

                 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
	
                 WebDriver driver = new ChromeDriver();
                 
                 driver.get("https://www.redbus.in/");
                 
                 driver.manage().window().maximize();
                 
                 Thread.sleep(4000);
                 
                 String ActualUrl = driver.getCurrentUrl();
                 {System.out.println(ActualUrl);}
                 
                 String ExpectedUrl ="https://www.redbus.in/";
                 
                  if(ExpectedUrl.equals(ActualUrl)) {
                	  
                	  System.out.println("Correct Url");
                  }
                  else {System.out.println("Wrong Url");}
                  
                  String ActualTitle = driver.getTitle();
                  {System.out.println(ActualTitle);}
                  
                  String ExpectedTitle ="Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";
                  
                  if(ExpectedTitle.equals(ActualTitle)) {
                	  
                	  System.out.println("Correct Title");
                  }
                  else {System.out.println("Wrong Title");}
                  
                  
                 driver.get("https://www.facebook.com/");
                 
                 Thread.sleep(4000);
                 
                 Dimension D = new Dimension(700, 300);
                 
                 driver.manage().window().setSize(D);
                 
                 System.out.println(driver.manage().window().getSize());
                 
                 Thread.sleep(4000);
                 
                 Point P = new Point(200, 600);
                 
                 driver.manage().window().setPosition(P);
                 
                 System.out.println(driver.manage().window().getPosition());
                 
                 Thread.sleep(4000);
                 
                 driver.navigate().back();
                 
                 Thread.sleep(3000);
                 
                 driver.navigate().forward();
                 
                 Thread.sleep(3000);
                 
                 driver.navigate().refresh();
                 
                 Thread.sleep(2000);
                 
                 driver.quit();
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                  
          
                 
                 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
