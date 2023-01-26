package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0\")]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
		
		boolean b = driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).isSelected();
		System.out.println(b);
		
		String W = driver.findElement(By.xpath("//div[contains(text(),\"It's quick and easy\")]")).getText();
		System.out.println(W);
		
		boolean b1 = driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).isEnabled();
		System.out.println(b1);
		
		
		WebElement d = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement m = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement y = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		

		String S1 = "1/Jan/1999";
		String S2[] = S1.split("/");
		
		m1(d, S2[0]);
		m1(m, S2[1]);
		m1(y, S2[2]);
	}
	
	public static void m1(WebElement W , String St) {
		
		Select S = new Select(W);
		S.selectByVisibleText(St);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
