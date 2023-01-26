package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(3000);
		
		WebElement Source = driver.findElement(By.id("box4"));                   //It is  source from which we drag the element
		
		WebElement Target = driver.findElement(By.id("box104"));                  //It is destination from which we drop the draged element
		
		Actions AT = new Actions(driver);                     //drag & drop method is availble in actions class
		                                                           //& it is non static method that's why we have to create the object of actions class
		
		AT.dragAndDrop(Source, Target).build().perform();                   //drag & drop method accept 2 input parameter i.e source & target
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
