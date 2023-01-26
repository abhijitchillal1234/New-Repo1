package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandle3 {
	

	public static void main(String[] args) throws InterruptedException {


			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
			
			Set<String> WindowID = driver.getWindowHandles();           //TO find the id od windows
			
			Iterator<String> it = WindowID.iterator();
			
			String ParentwindowID = it.next();
			String ChildwindowID  = it.next();
			
			System.out.println(ParentwindowID);
			System.out.println(ChildwindowID);
			
			driver.switchTo().window(ChildwindowID);               //TO switch the focus of selenium from parentwindow to childwindow
			
			String TitleChildwindow = driver.getTitle();                    //To get the title of childwindow
			System.out.println(TitleChildwindow);
			
			Thread.sleep(4000);
			
			driver.switchTo().window(ParentwindowID);            //TO switch the focus of selenium from child window to parent window
			
			String TitleParentwindow = driver.getTitle();                    //To get the title of Parent window
			System.out.println(TitleParentwindow);
			
            Thread.sleep(4000);
            
            driver.switchTo().window(ChildwindowID);                  //TO switch the focus of selenium from parentwindow to childwindow  
            
            driver.findElement(By.id("Form_getForm_Email")).sendKeys("Rohit");
            
            driver.findElement(By.id("Form_getForm_action_submitForm")).click();
            
            Thread.sleep(4000);
			
			driver.quit();
			
			 
			
			
			
			
			
			
			
		



			
			
			
		
	}
	
	

}
