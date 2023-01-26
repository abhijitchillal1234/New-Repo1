package MethodsFromSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String Expected ="Facebook-log in or sign up";
		
		String Title = driver.getTitle();
		{System.out.println(Title);}
		
		if (Expected.equals(Title)) {
			
			System.out.println("Correct Title");
		}
		else {System.out.println("Incorrect Title");}
		
		Thread.sleep(3000);
		
		driver.close();
     
		
		
		
		
		
		
		
	}

}
