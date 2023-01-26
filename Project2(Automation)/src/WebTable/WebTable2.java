package WebTable;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable2 {

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
		  
		//2<=7-------------true
		//6<=7-------------true
		for(int R=2;R<=Row;R++) {
			
			//1<=3-------------true
			//2<=3------------true
			//3<=3------------true
		    //-------------------------------------	
			//3<=3-------------true
			for(int C=1;C<=Column;C++) {
				                                                                                            //2        1
				                                                                                            //2        2
				                                                                                            //2        3
				                                                                                            //--------------------------
				                                                                                            //6         3
				String ActualText = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + R + "]/td[" + C + "]")).getText();				 
				       //Alfreds Futterkiste.equals("Canada")--------false
				       //Maria Anders.equals("Canada")---------------false
				       //Germany.equals("Canada")---------------false
				       //Canada.equals("Canada")---------------true
			
				if (ActualText.equals("Canada")) {

					System.out.println(ActualText);
					System.out.print("Row No :" + R + " :" + "Col No :" + C);
					break;
					
				}
				
		}
			System.out.println();
			
	
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
