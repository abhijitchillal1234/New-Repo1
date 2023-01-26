package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement Element = driver.findElement(By.xpath("//div[@class=\"eFQ30H\"]"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver; 
		
		 JS.executeScript("arguments[0].style.border='10px solid Red'" , Element);         //heighlight border
		 System.out.println("Border hightlighted");
		 
		 Thread.sleep(4000);
		 
		 JS.executeScript("arguments[0].style.background='10px solid Blue'" , Element);   //heightlight background
		 System.out.println("Background hightlighted");
		 
		 Thread.sleep(4000);
		 
		 JS.executeScript("window.scrollBy(0 , 5000)");                      //Scroll by indexing
		 System.out.println("Scroll from to to bottom by indexing");
		 
		 Thread.sleep(4000);
		 
		 JS.executeScript("window.scrollBy(0 , -3000)");
		 System.out.println("Scroll from bottom to top by indexing");
		 
		 Thread.sleep(4000);
		 
		 WebElement Element1 = driver.findElement(By.xpath("//div[@class=\"LfkXVL\"]"));

		 JS.executeScript("arguments[0].scrollIntoView();", Element1);             //scroll by element
		 System.out.println("scroll by element");
		 
		 Thread.sleep(4000);
		
		 WebElement Element2 = driver.findElement(By.xpath("(//div[@class=\"eFQ30H\"])[2]"));
		 
		 JS.executeScript("arguments[0].scrollIntoView();", Element2);
		 System.out.println("Scroll by element2");
		
		 Thread.sleep(4000);
		 
		 JS.executeScript("arguments[0].click()", Element2);                    //Click operation
		 System.out.println("Click operation by javascriptexecutor");
		 
		 Thread.sleep(4000);
		 
		 WebElement Element3 = driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
		 
		 JS.executeScript("arguments[0].value='Avinash';", Element3);                //sendkey operation
		 System.out.println("Sendkey operation by javascriptexecutor");
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
	}



}
