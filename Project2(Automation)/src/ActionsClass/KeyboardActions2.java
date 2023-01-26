package ActionsClass;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions2 {

	public static void main(String[] args) throws InterruptedException {
		
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			WebElement  InputUser = driver.findElement(By.id("email"));
			
			WebElement InputPass = driver.findElement(By.id("pass"));
			
			Thread.sleep(3000);
			
			InputUser.sendKeys("This is my first java programme");
			
			Actions AT = new Actions(driver);
			
			Thread.sleep(2000);
			
			//Control A--------to select all
			
			AT.keyDown(Keys.CONTROL);              //keydown is used to perform keypress without release
			AT.sendKeys("a");
			AT.keyUp(Keys.CONTROL);               //keyup is used to perform key release
			AT.build().perform();
			
			//Control C------to copy all
		
			AT.keyDown(Keys.CONTROL);
			AT.sendKeys("c");
			AT.keyUp(Keys.CONTROL);
			AT.build().perform();
			
			//Tab--------------
		
			AT.keyDown(Keys.TAB);
			AT.build().perform();
			
			Thread.sleep(2000);
			
			//Control V-------to paste all element to next tab
	    
			AT.keyDown(Keys.CONTROL);
	    	AT.sendKeys("v");
    		AT.keyUp(Keys.CONTROL);
    		AT.build().perform();
    		
    		Thread.sleep(3000);
    		
    		System.out.println(InputUser.getAttribute("value"));
    		
    		System.out.println(InputPass.getAttribute("value"));
    		
    		//Compare text--------
    		
    		if(InputUser.getAttribute("value").equals(InputPass.getAttribute("value"))) {
    			
    			System.out.println("Correct Copied");
    		}
    		else {System.out.println("Wrong Copied");}                           
    		
    		driver.quit();
    		
			
			
			
			
			
			
			
			
	}

}
			