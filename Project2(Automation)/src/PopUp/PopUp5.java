package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(1000);
		
//		driver.switchTo().alert().sendKeys("admin");--------------------NoAlertPresentException
		
//		Syntax:	(https://Username:Password@the-internet.herokuapp.com/basic_auth)
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(3000);
		
		String Text = driver.findElement(By.xpath("//p[contains(text(),\"Congratulations\")]")).getText();
		System.out.println(Text);
		
		driver.quit();
	}

}
