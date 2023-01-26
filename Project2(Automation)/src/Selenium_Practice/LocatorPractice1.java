package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");                
		
		driver.manage().window().maximize();                                          
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Abhi");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Chillal");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Pimpari-Chinchwad Pune");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("abhijitchillal2829@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("888888888888");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@name=\"radiooptions\"])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class=\"ui-autocomplete-multiselect ui-state-default ui-widget\"]")).sendKeys("Marathi");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[text()=\"Select Skills\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("countries")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//select[@type=\"text\"])[3]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("daybox")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Abhi");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("Chillal");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("submitbtn")).click();
		
		
		
	
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
