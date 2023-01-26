package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable5 {

	public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		WebElement Ele = driver.findElement(By.xpath("//h3[text()=\"Example\"]"));
		
		Js.executeScript("arguments[0].style.border='10px solid Red'", Ele);
		
		Js.executeScript("arguments[0].style.background='Black'", Ele);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println(col.size());
		
		WebElement Ele1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[3]"));
		System.out.println(Ele1.getText());
		
		for(int a=0;a<row.size();a++) {
			
			for(int b=0;b<col.size();b++) {
				
				WebElement Ele2 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+ a +"]/td["+ b +"]"));
				System.out.println(Ele2.getText()+" | ");
			}
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
