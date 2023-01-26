package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod2 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.joinsuperset.com/");
		
		Dimension D = new Dimension(300, 500);
		
		driver.manage().window().setSize(D);
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
