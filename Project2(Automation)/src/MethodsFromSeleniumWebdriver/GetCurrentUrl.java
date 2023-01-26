package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Get Url Method----
//This will return url


public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();                                          
		
		String ActualUrl = driver.getCurrentUrl();
		   {System.out.println(ActualUrl);}
		   
		   String ExpectedUrl ="https://www.facebook.com/";           //This will be given in requirenment.

		   if(ExpectedUrl.equals(ActualUrl)) {
			   
			   System.out.println("Correct URL");
		   }
		   else {System.out.println("Incorrect URL");}
		   
		   Thread.sleep(5000);
		   
		   driver.close();
		   
		
		
		
		
		
		
		
		
	}

}
