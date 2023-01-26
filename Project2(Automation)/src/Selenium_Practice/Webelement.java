package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {

	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mi");
			
			driver.findElement(By.xpath("//span[@id=\"nav-search-submit-text\"]")).click();
			
			WebElement A = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		    A.clear();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//span[@class=\"nav-icon nav-arrow\"]")).click();
		    
		    boolean b = driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-radio\"])[2]")).isSelected();
		    System.out.println(b);
		    
		    boolean b1 = driver.findElement(By.xpath("//div[@class=\"a-row\"]")).isDisplayed();
		    System.out.println(b1);
		    
		    boolean b2 = driver.findElement(By.xpath("//span[@id=\"icp-save-button\"]")).isEnabled();
		    System.out.println(b2);
		    
		    String W = driver.findElement(By.xpath("(//a[contains(text(),\"Sell \")])[2]")).getText();
		    System.out.println(W);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
