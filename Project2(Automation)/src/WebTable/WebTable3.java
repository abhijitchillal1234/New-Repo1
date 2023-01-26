package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);         //Implicit Wait
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
		driver.manage().window().maximize();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//h4[contains(text(),\"Practice\")]"));
		
		JS.executeScript("arguments[0].scrollIntoView();", Element);
		
		int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println(Row);
		
		int Col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println(Col);
		
		String Text = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[2]")).getText();
		System.out.println("Specific element :"+Text);
		
		for(int R=2;R<=Row;R++) {
			
			for(int C=1;C<=Col;C++) {
				
				String ActualText = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+R+"]/td["+C+"]")).getText();
				System.out.print(ActualText+" | ");
				
			/*	if(ActualText.equals("Austria")) {
					
					System.out.println(ActualText);
					System.out.println("Row :"+R+ "Column :"+C);
					break;
				}                                  */
			}
			System.out.println();
		}
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
