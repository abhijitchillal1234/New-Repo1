package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		String E = driver.getCurrentUrl();
		System.out.println(E);
		
		String A ="https://www.amazon.in/";
		
		if(E.equals(A)) {
			
			System.out.println("Correct url");
		}
		else {System.out.println("Wrong url");}
		
		String E1 = driver.getTitle();
		System.out.println(E1);
		
		String B = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(E1.equals(B)) {
			
			System.out.println("Correct title");
		}
		else {System.out.println("Wrong Title");}
		
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getPosition());
		
		Dimension D = new Dimension(1000, 200);
		driver.manage().window().setSize(D);
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(3000);
		
		Point P = new Point(200, 500);
		driver.manage().window().setPosition(P);
		
		System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(2000);
		
		driver.get("https://www.functionize.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
