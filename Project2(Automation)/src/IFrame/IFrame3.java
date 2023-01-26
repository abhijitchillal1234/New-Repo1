package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");        //frame by id
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		String Text = driver.findElement(By.xpath("//h1[contains(text(),\"This page \")]")).getText();
		System.out.println(Text);
		
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		
		String Text1 = driver.findElement(By.xpath("//p[contains(text(),\"You can\")]")).getText();
		System.out.println(Text1);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("menuButton")).click();
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
	}

}
