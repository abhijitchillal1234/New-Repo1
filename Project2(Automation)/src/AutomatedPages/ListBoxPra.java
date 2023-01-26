package AutomatedPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxPra {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
//		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		WebElement day = driver.findElement(By.id("day"));
		System.out.println(day.getSize());
		
		Select S = new Select(day);
		
		S.selectByValue("20");
		
		driver.quit();
		
		

	}

}
