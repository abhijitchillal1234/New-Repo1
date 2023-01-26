package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions3 {

	public static void main(String[] args) throws InterruptedException {

	           System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(3000);
				
				WebElement Username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
				
				WebElement Password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
				
				Thread.sleep(3000);
				
				Username.sendKeys("Admin");
				
				Thread.sleep(4000);
				
				Actions At = new Actions(driver);
				
				//Control A-----
				
				At.keyDown(Keys.CONTROL);              //keydown is used to press on control
				At.sendKeys("a");
				At.keyUp(Keys.CONTROL);                //keyup is used to realese from contrl
				At.build().perform();
				
				//Contrl C------
				
				At.keyDown(Keys.CONTROL);
				At.sendKeys("c");
				At.keyUp(Keys.CONTROL);
				At.build().perform();
				
				//Tab------
				
				At.keyDown(Keys.TAB);
				At.build().perform();
				
				Thread.sleep(4000);
				
				//Control V------
				
				At.keyDown(Keys.CONTROL);
				At.sendKeys("v");
				At.keyUp(Keys.CONTROL);
				At.build().perform();
				
				System.out.println(Username.getAttribute("value"));
				
				System.out.println(Password.getAttribute("value"));
				
				if(Username.getAttribute("value").equals(Password.getAttribute("value"))) {
					
					System.out.println("Correct Copied text");
					
				}
				else {System.out.println("Wrong Copied text");                   
               
				
				
				
				
				
	}


	}
}
	


