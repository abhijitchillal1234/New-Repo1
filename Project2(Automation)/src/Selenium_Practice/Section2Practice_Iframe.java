package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section2Practice_Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();

		WebElement Outerfame = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(Outerfame);
		
		driver.switchTo().frame(0);                          //Frame by indexing.                     

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("XYZAET");  
		
		driver.switchTo().parentFrame();
		
		String S = driver.findElement(By.xpath("//h5[text()=\"Nested iFrames\"]")).getText();
		System.out.println(S);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=\"Single Iframe \"]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
