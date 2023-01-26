package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlMethod2 {

	public static void main(String[] args) throws InterruptedException {

		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.joinsuperset.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			String ActualUrl = driver.getCurrentUrl();
			
			System.out.println(ActualUrl);
			
			String ExpectedUrl = "https://app.joinsuperset.com/#/s/feed";
			
			
			if (ExpectedUrl.equals(ActualUrl)) {
				
				System.out.println("Correct Url");
			}
			else {System.out.println("Wrong Url");}
			
			driver.close();
			
	}

}
