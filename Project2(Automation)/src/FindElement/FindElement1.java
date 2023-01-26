package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {

	public static void main(String[] args) throws InterruptedException {


    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		//1)
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("OnePlus");
		
		//2)
		WebElement Text1 = driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));   //It return only 1st element
		System.out.println(Text1.getText());
		
		//3)
		WebElement Link = driver.findElement(By.xpath("//a[@class=\"nav-asd \"]"));    //NoSuchElementException (If element is not present it throws exception)
		Link.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	}

}
