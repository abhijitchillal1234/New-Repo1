package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

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
		
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		
		driver.findElement(By.xpath("//option[text()=\"1\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		
		driver.findElement(By.xpath("//option[text()=\"Jan\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		
		driver.findElement(By.xpath("//option[text()=\"2010\"]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	
	}
}
