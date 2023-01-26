package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction2 {

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		WebElement Element = driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]"));
		
		Actions AC = new Actions(driver);
		
		AC.moveToElement(Element).perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		
	}

}
