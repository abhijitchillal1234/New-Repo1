package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(3000);
		
		WebElement Source1 = driver.findElement(By.id("box7"));
		
		WebElement Target1 = driver.findElement(By.id("box107"));
		
		Actions AT = new Actions(driver);
		
		AT.dragAndDrop(Source1, Target1).build().perform();
		
		Thread.sleep(3000);
		
    	WebElement Source2 = driver.findElement(By.id("box1"));
		
		WebElement Target2 = driver.findElement(By.id("box101"));
		
		AT.dragAndDrop(Source2, Target2).build().perform();
		
        Thread.sleep(3000);
		
    	WebElement Source3 = driver.findElement(By.id("box5"));
		
		WebElement Target3 = driver.findElement(By.id("box105"));
		
		AT.dragAndDrop(Source3, Target3).build().perform();
		
	    Thread.sleep(3000);
			
	   	WebElement Source4 = driver.findElement(By.id("box2"));
			
    	WebElement Target4 = driver.findElement(By.id("box102"));
    	
    	AT.dragAndDrop(Source4, Target4).build().perform();
    	
        Thread.sleep(3000);
			
 	   	WebElement Source5 = driver.findElement(By.id("box3"));
 			
     	WebElement Target5 = driver.findElement(By.id("box103"));
		
     	AT.dragAndDrop(Source5, Target5).build().perform();
     	
        Thread.sleep(3000);
			
  	   	WebElement Source6 = driver.findElement(By.id("box6"));
  			
      	WebElement Target6 = driver.findElement(By.id("box106"));
 		
      	AT.dragAndDrop(Source6, Target6).build().perform();
      	
        Thread.sleep(3000);
		
  	   	WebElement Source7 = driver.findElement(By.id("box4"));
  			
      	WebElement Target7 = driver.findElement(By.id("box104"));
 		
		AT.dragAndDrop(Source7, Target7).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
