package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(2000);
		
		WebElement Element = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		
		Actions AC = new Actions(driver);
		
		AC.contextClick(Element).perform();
		
		Thread.sleep(2000);
		
		WebElement Element1 = driver.findElement(By.xpath("//span[text()=\"Edit\"]"));
		
		AC.contextClick(Element1).perform();
		
		Thread.sleep(2000);
		
		String Text = driver.switchTo().alert().getText();
		System.out.println(Text);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
