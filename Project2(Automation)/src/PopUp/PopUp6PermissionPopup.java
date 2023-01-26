package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUp6PermissionPopup {
	
	//Permission PopUp---------------(To handle window base popups we use object of "chromeoptions" class)

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(3000);
		
//		driver.quit();
		
	}

}
