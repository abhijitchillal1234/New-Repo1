package PopUp;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PopUp2HiddenDivision {
	
	//Hidden division PopUps---------------------------

	public static void main(String[] args) throws InterruptedException, IOException {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();      //To "click on Ok" button of popup
		
		Thread.sleep(1000);
		
		boolean B1 = driver.findElement(By.id("result")).isDisplayed();
		System.out.println(B1);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();      //To click on "Dismiss" buuton of popup
		
		boolean B2 = driver.findElement(By.xpath("//p[text()=\"You clicked: Cancel\"]")).isDisplayed();
		System.out.println(B2);
		
	   driver.quit();
	
	}

}
