package Selenium_Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	public static void main(String[] args) throws InterruptedException {

		//alert---------interface 
		  //accept-----ok
		  //dismiss----cancle
		  //gettex-----message
		  //sendkey----message
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[contains(text(),\"Click \")]")).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			
			System.out.println(driver.findElement(By.id("result")).getText());
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Confirm\")]")).click();
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().dismiss();
			
			Thread.sleep(3000);
			
			System.out.println(driver.findElement(By.xpath("//p[contains(text(),\"You\")]")).getText());
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Prompt\")]")).click();
			
			Thread.sleep(2000);
			
			System.out.println(driver.switchTo().alert().getText());
			
			Thread.sleep(1000);
			
			driver.switchTo().alert().sendKeys("String data");
			
			Thread.sleep(4000);
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(1000);
			
			System.out.println(driver.findElement(By.id("result")).getText());
			
			driver.quit();

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
