package WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	//To get the ID of single browser we use "driver.getWindowHandle" method-------------------
	
	public static void main(String[] args) throws InterruptedException {

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			
			String WindowID = driver.getWindowHandle();
			System.out.println(WindowID);
			
		//	WindowID = CDwindow-948308182216270A2D6A91AA8201BCCB
	   //	WindowID = CDwindow-BB9F637E2FCFF8D6605EBFEF52542844 ----------Every time of execution it return different id
	  //	WindowID = CDwindow-6C7D54E1C2A55DE783C68EF44451F021----------Every time of execution it return different id


			
			driver.quit();
			
			
			
	}

}
