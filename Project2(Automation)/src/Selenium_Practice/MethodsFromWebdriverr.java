package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsFromWebdriverr {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String ActualT = driver.getTitle();
		
		System.out.println(ActualT);
		
		String ExpectedT ="";
		
		if(ExpectedT.equals(ActualT)) {
			
			System.out.println("Correct");
		}
		else {System.out.println("Wrong");}
		
		String ActualU = driver.getCurrentUrl();
		
		System.out.println(ActualU);
		
		String ExpectedU ="";
		
		if(ExpectedU.equals(ActualU)) {
			
			System.out.println("Correct");
		}
		else {System.out.println("Wrong");}
		
		Dimension D= new Dimension(0, 0);
		
		driver.manage().window().setSize(D);
		
		System.out.println(driver.manage().window().getSize());
		
		Point P = new Point(0, 0);
		
		driver.manage().window().setPosition(P);
		
		System.out.println(driver.manage().window().getPosition());

		driver.get("https://www.youtube.com/");
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
