package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp4 {

	public static void main(String[] args) throws InterruptedException {

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("login1")).sendKeys("Ravan");
			
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
			Thread.sleep(2000);
			
			Alert PopUp = driver.switchTo().alert();
			String AText = PopUp.getText();
			System.out.println(AText);
			
			String EText = "Please enter your password";
			
			if(EText.equals(AText)) {
				
				System.out.println("Correct alert message ");
			}
			else {
				
				System.out.println("Wrong alert message");
			}
			
			PopUp.accept();
			
			Thread.sleep(2000);
			
			driver.quit();
			
			
			
			
			
			
			
			
	}

}
