package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp7FileUploadPopUp {
	
	//File Upload Popup---------------------------------

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Ramesh\\Desktop\\Sheet1.xlsx");    //if there is "type=file" then we directly upload the file
		
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("file-submit")).click();
	    
	    Thread.sleep(1000);
	    
	    boolean B = driver.findElement(By.xpath("//h3[text()=\"File Uploaded!\"]")).isDisplayed();
		System.out.println(B);
		
		driver.quit();
	
	
	
	
	}

}
