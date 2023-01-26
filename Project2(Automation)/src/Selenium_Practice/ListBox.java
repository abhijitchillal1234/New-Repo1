package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.functionize.com/free-trial");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("SUENIDF");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("DRUJNFIJ");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("AERTGVJ1@gmai.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9999999999");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("AYGBJNBU");
		
		Thread.sleep(1000);
		
		WebElement Jobrole        = driver.findElement(By.xpath("//select[contains(@id,\"job_role-46e27199-3\")]"));
		WebElement Testsuit       = driver.findElement(By.xpath("//select[contains(@id,\"total_size_of_test_suit\")]"));
		WebElement Testautomation = driver.findElement(By.xpath("//select[contains(@id,\"any_upcoming\")]"));
		
              String A = "QA Analyst/501-1000/Move to cloud";
              String[] B = A.split("/");
              
              String Z = "Director, Head of, or VP of Quality/1001+/Upgrades";
              String Y[] = Z.split("/");
              
              
              m1(Jobrole, B[0]);
              m1(Testsuit, B[1]);
              m1(Testautomation, B[2]);
              
              Thread.sleep(2000);
              
              m1(Jobrole, Y[0]);
              m1(Testsuit, Y[1]);
              m1(Testautomation, Y[2]);
              
              
		
			}

	
	  public static void m1(WebElement W , String V) {
		  
		  Select S = new Select(W);
		  S.selectByVisibleText(V);
		  
	  }
	
	
	
	
	
}
