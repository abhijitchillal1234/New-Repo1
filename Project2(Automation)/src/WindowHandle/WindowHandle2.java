package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
	
	//To get the ID of multiple browsers we use "driver.getWindowHandles" method-------------------


	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
			
			Set<String> WindowID = driver.getWindowHandles();  //Method is used to store all the opened windows id in the set data
			System.out.println(WindowID);
			
			Thread.sleep(2000);
			
			//WindowID=[CDwindow-C78E483441FC007F310770254EE61577, CDwindow-5C9C29144C81228878F7FAB41781AC85]
			
			Iterator<String> it = WindowID.iterator();   //Iterator is used to maintain the insertion order.
			String ParentWindowID = it.next();
            String ChildWindowID  = it.next();
			
            System.out.println("ParentWindowID :"+ParentWindowID);
            System.out.println("ChildWindowID  :"+ChildWindowID);
            
            driver.switchTo().window(ChildWindowID); //It is used to switch the focus of selenium from Parent window to Child Window.
           
            driver.findElement(By.id("Form_getForm_Email")).sendKeys("Rohit");
            
            driver.findElement(By.id("Form_getForm_action_submitForm")).click();
            
            Thread.sleep(3000);
            
            driver.quit();
			
			
			

	}

}
