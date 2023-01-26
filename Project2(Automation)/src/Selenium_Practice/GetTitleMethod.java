package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://twitter.com/");

	String Actual =driver.getTitle();
	
	System.out.println(Actual);
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	String Expected ="Twitter";
	
	if (Expected.equals(Actual)) {
		
		System.out.println("Correct Title");
	}
	else {System.out.println("Incorrect Title");}
	
	driver.close();
	
	
	
	
	
	
	
		
	}

}
