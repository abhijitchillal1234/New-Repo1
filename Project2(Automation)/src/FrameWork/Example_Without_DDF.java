package FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Without_DDF {
	
	//Without DDF------
	  //we are adding hardcore values of test data in test cases

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter username-------
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		//Enter Password-----
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		//Click on login---------
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//for validation-----------
		
		System.out.println(driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText());
		
		driver.quit();
		
		
		
		
	}

}
