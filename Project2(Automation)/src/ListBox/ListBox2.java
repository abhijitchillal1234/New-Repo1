package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//List Box by object of Select class
      //Method of select class SelectByVisibleText   (Visible Text Accpet only String type value)

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//a[contains(@id,\"u_0_0\")]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rohit");
				
				driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");
				
				driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9999999999");
				
				driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("@#$$TYFHU");
				
				Thread.sleep(1000);
				
				//Step 1---------Store the listbox in referance variable  (WebElement is the return type of FindElement method)
				
				WebElement Day    = driver.findElement(By.xpath("//select[@id=\"day\"]"));
				WebElement Month  = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
				WebElement Year   = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
				
			
				Select S1 = new Select(Day);    //Step 2-------Create the object of select class.This select class is accept WebElement Argument
				S1.selectByVisibleText("16");   //Step 3--------Use select class method to select option
				
				Select S2 = new Select(Month);
				S2.selectByVisibleText("Dec");
				
				Select S3 = new Select(Year);
				S3.selectByVisibleText("1998");
				
				Thread.sleep(4000);

				S1.selectByVisibleText("20");
				
				S2.selectByVisibleText("Sep");
				
				S3.selectByVisibleText("1999");

				Thread.sleep(3000);
				
				S1.selectByIndex(1);
				
				S2.selectByIndex(2);
				
				S3.selectByIndex(21);
	}
}
