package JavaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown1 {
	
	//Scroll by indexing------------
	  //Syntax----------
	    //JS.executescript("window.scrollBy(0 , 5000)");------------------top to bottom scroll
	    //JS.exectescript("window.scrollBy(0, -3000)");-------------------bottom to top scroll

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("window.scrollBy(0 , 7000)");
		
		Thread.sleep(3000);
		
		JS.executeScript("window.scrollBy(0 , -4000)");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
