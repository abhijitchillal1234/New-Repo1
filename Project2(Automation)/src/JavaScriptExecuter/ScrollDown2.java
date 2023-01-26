package JavaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown2 {
	
	//Scroll directly from top to bottom & bottom to top------------
	  //Syntax----------
	    //JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");------------------directly top to bottom scroll
	    //JS.executeScript("document.documentElement.scrollTop=0", "");---------------------------directly bottom to top scroll

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(3000);
		
		JS.executeScript("document.documentElement.scrollTop=0", "");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
