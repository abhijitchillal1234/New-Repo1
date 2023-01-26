package MultipleLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//Click on perticular link----------
		driver.findElement(By.linkText("Today's Deals")).click();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));         //Links is availble in "a" type tagname
		System.out.println("Total number of links :"+Links.size());           //Total nuber of links present on webpage
		
		for(int a=0;a<Links.size();a++) {                                    //Print all the links from webpage one by one
			
			System.out.println(Links.get(a).getText());                      //It return only text of link
			System.out.println(Links.get(a).getAttribute("href"));           //It return whole link 
			
		}
		
		
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
