package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsFromWebdriver {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		String ActualUrl = driver.getCurrentUrl();
		System.out.println(ActualUrl);
		
		String ExpectedUrl = "https://www.orangehrm.com/\r\n";
				
		
		if(ExpectedUrl.equals(ActualUrl)) {
			
			System.out.println("Correct Url");
		}
		else {System.out.println("Wrong Url");}
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		String ExpectedTitle ="OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM\r\n";
				
		
		if(ExpectedTitle.equals(ActualTitle)) {
			
			System.out.println("Correct Title");
		}
		else {System.out.println("Wrong Title");}
		
		Dimension D = new Dimension(490, 590);
		
		driver.manage().window().setSize(D);
		
		System.out.println(driver.manage().window().getSize());
		
		Point P = new Point(100, 500);
		
		driver.manage().window().setPosition(P);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(4090);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
