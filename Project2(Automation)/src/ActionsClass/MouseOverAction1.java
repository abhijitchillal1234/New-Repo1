package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction1 {
	
	//To Mouse over action we use the "moveToElement" method whic is non-static method from actions class.

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		WebElement Element = driver.findElement(By.xpath("//a[@data-nav-role=\"signin\"]"));
		
		Actions AC = new Actions(driver);
		
		AC.moveToElement(Element).build().perform();             //"moveToElement()" method used to mouse work.
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
