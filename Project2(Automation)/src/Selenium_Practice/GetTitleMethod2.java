package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod2 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.joinsuperset.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			String ActualTitle = driver.getTitle();
			
			System.out.println(ActualTitle);
			
			String ExpectedTitle ="Superset :: University Recruiting Platform";
			
			if (ExpectedTitle.equals(ActualTitle)) {
				
				System.out.println("Correct Title");
			}
			else {System.out.println("Wrong Title");}

			driver.close();
			
	}

}
