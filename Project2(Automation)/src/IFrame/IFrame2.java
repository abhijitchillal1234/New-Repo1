package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {
	
	//Double frame (Frame in frame)---------------------------
          //1st find outer frame 
	      //2nd find inner frame-------------------by indexing
	      //find the locatter of element
	    
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();

		WebElement Outerfame = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(Outerfame);
		
		driver.switchTo().frame(0);                          //Frame by indexing.                     

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Autoamtion");          
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//a")).click();
		
		Thread.sleep(2000);
		
		driver.quit();

		
		
		
		
		
		
		
		
		
		
	}

}
