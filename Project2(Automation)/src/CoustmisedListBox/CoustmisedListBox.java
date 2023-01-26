package CoustmisedListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CoustmisedListBox {

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement Element = driver.findElement(By.xpath("//span[@class=\"nav-line-2\"]"));
		
		Actions Ac = new Actions(driver);
		
		Ac.moveToElement(Element).perform();
		
//		List<WebElement> List = driver.findElements(By.xpath("//span[@class=\"nav-text\"]/span"));
//		
//		System.out.println(List.size());
//		
//		for(int a=0;a<List.size();a++) {
//			
//			System.out.println(List.get(a).getText());
//		}
//		
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}

}
