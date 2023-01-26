package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");                                                    
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String Actual =driver.getCurrentUrl();
		System.out.println(Actual);
		
		String Expected ="https://www.facebook.com/login/";
		
		if(Expected.equals(Actual)) {
			
			System.out.println("Correct Url");
		}
		else {System.out.println("Wrong Url");}
		
		String Actual1 =driver.getTitle();
		System.out.println(Actual1);
		
		String Expected1= "Log in to Facebook";
		
		if(Expected1.equals(Actual1)) {
			
			System.out.println("Correct Title");
		}
		else {System.out.println("Wrong Title");}
		
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getPosition());
		
		Dimension D = new Dimension(300, 500);
		
		driver.manage().window().setSize(D);
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getSize());
		
		Point P = new Point(400, 600);
		
		driver.manage().window().setPosition(P);
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.findElement(By.xpath("//a[@href=\"/r.php?locale=en_GB&display=page\"]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
