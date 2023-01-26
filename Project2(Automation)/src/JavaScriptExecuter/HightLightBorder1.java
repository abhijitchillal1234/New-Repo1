package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightLightBorder1 {
	
	//To hightlight any element we use javascriptexecuter interface 
	    //from javascriptexecuter interface we use executescript method------
	
	        //Syntax for hightlight the element---------
	              // JS.executescript("arguments[0].style.border ='10px solid colour'" , args);
	        
	       //Syntax for background hightlight-----------
	             //	 JS.executeScript("arguments[0].style.background='10px solid Black'", Element);


	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement Element = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("arguments[0].style.border='10px solid Red'", Element);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
