package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Parameterisation {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement A = driver.findElement(By.xpath("//h2[text()=\"Register\"]"));
		WebElement B = driver.findElement(By.xpath("//div[@class=\"container center\"]"));
		WebElement C = driver.findElement(By.xpath("//form[@id=\"basicBootstrapForm\"]"));
		WebElement D = driver.findElement(By.xpath("//footer[@id=\"footer\"]"));
		
		WebElement E =  driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Select S = new Select(E);
		List<WebElement> S1 = S.getOptions();
		System.out.println(S1.size());
		
		for(int a=0;a<S1.size();a++) {
			
			System.out.println(S1.get(a).getText());
			
			if(S1.get(a).getText().equals("Adobe Photoshop")) {
				
				S1.get(a).click();
			}
		}
		
		driver.findElement(By.xpath("//span[@id=\"select2-country-container\"]")).click();
		
		List<WebElement> Country = driver.findElements(By.xpath("//ul[@id=\"select2-country-results\"]//li"));
		
		System.out.println(Country.size());
		
		for(int b=0;b<Country.size();b++) {
			
			System.out.println(Country.get(b).getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		ScreenShot(A);
		ScreenShot(B);
		ScreenShot(C);
		ScreenShot(D);
		
		driver.quit();
		
		
	}
	
	public static void ScreenShot(WebElement W) throws IOException {
		
		File Source = ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(4);
		
		String Imagename = "AAAAAAAAAAAA";
	
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(Source, Dest);
		
		
	}



}
