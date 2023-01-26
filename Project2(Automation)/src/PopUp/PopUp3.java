package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp3 {

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(1000);
		
     	driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		
		Thread.sleep(1000);
		
		String ETextPopUp = "I am a JS prompt";
		
		String ATextPopUp = driver.switchTo().alert().getText();              //To "get the text" from PopUp
		System.out.println(ATextPopUp); 
		
		if(ETextPopUp.equals(ATextPopUp)) {
			
			System.out.println("Correct Text");
			
		}
		else {
			System.out.println("Wrong Text");
		}
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Java");    //To "send text" on Popup
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();              //To click on "Ok" button of popup
		
		Thread.sleep(1000);
		
		boolean B3 = driver.findElement(By.id("result")).isDisplayed();
        System.out.println(B3);
        
        driver.quit();
		
		
		
	}

}
