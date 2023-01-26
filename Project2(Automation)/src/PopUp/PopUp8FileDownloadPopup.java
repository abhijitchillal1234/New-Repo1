package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp8FileDownloadPopup {
	
	//File download Popup---------------------(By Click action we download any file)

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"File\")]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\"STUDENTS.xlsx\"]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
