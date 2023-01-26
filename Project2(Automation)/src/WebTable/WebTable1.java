package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable1 {

		/*	A Web Table in Selenium is a WebElement used for the tabular representation of data or information.
	          The data or information displayed can be either static or dynamic. 
	              Web table and its elements can be accessed using WebElement functions and locators in Selenium      */

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);         //Implicit Wait
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		driver.manage().window().maximize();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//h3[text()=\"Example\"]"));
		
		JS.executeScript("arguments[0].scrollIntoView();", Element);                     //Scroll by element
		
		int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();     //Size of row
		System.out.println("Size of row :"+Row);
		
		int Column = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();   //Size of column
		System.out.println("Size of column :"+Column);
		
		//To print specific element from table------>>>>>>
		
		String Text = driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody/tr[4]/td[2]")).getText();  
		System.out.println("Specific element :"+Text);
		
		String Text1 = driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr[7]/td[3]")).getText();
		System.out.println("Specific element :"+Text1);
		
		//To print all the elements from table------>>>>>
		
		for(int R=2;R<=Row;R++) {
			
			for(int C=1;C<=Column;C++) {
				
				 String ActualText = driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr["+R+"]/td["+C+"]")).getText();
				System.out.print(ActualText+" | ");
				
		}
			System.out.println();
			
	
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
