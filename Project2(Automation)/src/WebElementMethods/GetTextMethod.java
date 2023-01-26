package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");		
			
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.facebook.com/");
         
         driver.manage().window().maximize();
         
         Thread.sleep(2000);
         
         String Expected ="Facebook helps you connect and share with the people in your life.";
         
        String TextActual = driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps you connect \")]")).getText();		
		System.out.println(TextActual);
		
		if(Expected.equals(TextActual)) {
			
			System.out.println("Correct Text");
		}
		else {System.out.println("Wrong Text");}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
