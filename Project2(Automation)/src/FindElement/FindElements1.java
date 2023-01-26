package FindElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		  driver.get("https://www.amazon.in/");
	 
		//1)
	//	List<WebElement> Searchbox = driver.findElements(By.xpath("twotabsearchtextbox")); 
	//	Searchbox.sendKeys("OnePlus");             because of multiple elements sendkey method is not availble 
		
		//2)
/*		List<WebElement> Text1 =  driver.findElements(By.xpath("//div[@id=\"nav-xshop\"]//a"));   //It return only All elements elements            
		
		for(WebElement STR : Text1 ) {
			
			System.out.println(STR.getText());
		}
		
		//3)
		List<WebElement> Link = driver.findElements(By.xpath("//a[@class=\"nav-asd \"]"));   //it does not throw execption return "zero"
		System.out.println(Link.size());           */
		
		                       
		
		
		
		
		
		
		
	}

}
