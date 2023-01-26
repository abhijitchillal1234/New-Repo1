package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_\")]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("GYTGHHUZSD");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("HGFTVGHVGFY");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("54509445-38923174r1325");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("FTDJH@gmail.com");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("FTDJH@gmail.com");
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("KGTDJKVTYUGTF");
		
		Thread.sleep(2000);
		
		WebElement D = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement M = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Y = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		

		String St ="19/Jan/2010";
		String Ss []= St.split("/");
		
		m1(D, Ss[0]);
		m1(M, Ss[1]);
		m1(Y, Ss[2]);
		
	}
	
	
	public static void m1(WebElement W , String S) {
		
		Select S1 = new Select(W);
		S1.selectByVisibleText(S);
	}
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
