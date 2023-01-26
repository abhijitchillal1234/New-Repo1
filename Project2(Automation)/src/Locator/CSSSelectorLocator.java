package Locator;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

                                             //CSS Selector----
                               //By Id---------------Syntax::driver.findElement(By.cssselector("tagname#IDvalue"))
                               //By Classname--------Syntax::driver.findElement(By.cssselector("tagname.classvalue"))

public class CSSSelectorLocator {

	public static void main(String[] args) throws InterruptedException {

		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.hubspot.com/login");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("#username")).sendKeys("abhijitchillal2829@gmail.com");         //By ID  
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#password")).sendKeys("AWRTYGD");                       //By ID
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("path.UICheckbox__PrivateCheckboxIconInnerSVG-g938e0-3.disFDC.private-checkbox__icon__inner")).click();        //By ClassName
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("button.uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.private-button--non-link")).click();     //By ClassName
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
