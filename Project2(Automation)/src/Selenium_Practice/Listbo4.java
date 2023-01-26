package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbo4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_\")]")).click();
		
		Thread.sleep(1000);
		
		WebElement D = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement M = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Y = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		

		String S2 ="20/Sep/1998";
		String S3 []= S2.split("/");
	
		m1(D, S3[0]);
		m1(M, S3[1]);
		m1(Y, S3[2]);
		
		Thread.sleep(1000);
		
		String S4 ="1/Aug/2000";
		String S5 []= S4.split("/");
		
		m1(D, S5[0]);
		m1(M, S5[1]);
		m1(Y, S5[2]);
		
		
		
		
	}
	
	public static void m1(WebElement W , String S) {
		
		Select S1 = new Select(W);
		S1.selectByVisibleText(S);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
