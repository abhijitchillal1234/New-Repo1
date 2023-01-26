package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUP9ChildBrowser {
	
	//Child browser popup--------(TO handle child browser popup we require ID of parent & child browser to shift the focus of selenium)

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String BaseUrl = "https://demoqa.com/browser-windows";
		
		driver.get(BaseUrl);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> WindowID = driver.getWindowHandles();         //To get id of parent & child window
		
		Iterator<String> it = WindowID.iterator();
		
		String ParentWindowID = it.next();
		String ChildWindowID  = it.next();
		
		System.out.println("ParentWindowID :"+ParentWindowID);
		System.out.println("ChildWindowID  :"+ChildWindowID);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(ChildWindowID);                   //TO switch focus of selenium parent window to child window
		
		String TextChildWindow = driver.findElement(By.id("sampleHeading")).getText();   //TO get text from child window
		System.out.println(TextChildWindow);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(ParentWindowID);                   //TO switch focus of selenium child window to parent window
		
		String TextParentWindow = driver.findElement(By.xpath("//div[text()=\"Browser Windows\"]")).getText();
		System.out.println(TextParentWindow);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
