package AutomatedPages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class guru99_1 {

	public static void main(String[] args) throws InterruptedException, IOException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V4/");
		
		Thread.sleep(1000);
		
		boolean B = driver.findElement(By.xpath("//div[@class=\"logo\"]")).isDisplayed();
		System.out.println(B);
		
		boolean B1 = driver.findElement(By.xpath("//div[@class=\"top-banner col-md-8\"]")).isDisplayed();
		System.out.println(B1);
		
		boolean B2 = driver.findElement(By.id("navbar-brand-centered")).isDisplayed();
		System.out.println(B2);
		
		String T = driver.findElement(By.xpath("//h2[text()=\"Guru99 Bank\"]")).getText();
		System.out.println(T);
		
		String T1 = driver.findElement(By.xpath("//span[contains(text(),\"Steps\")]")).getText();
		System.out.println(T1);
		
		List<WebElement> T2 = driver.findElements(By.xpath("//ol[@style=\"font-size:18px;\"]//li"));
		
		for(int T3=0;T3<T2.size();T3++) {
			
			System.out.println(T2.get(T3).getText());
		}

		driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
		
		java.util.List<WebElement> Selenium = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li"));
		System.out.println(Selenium.size());            //29
		
		for(int S=0;S<Selenium.size();S++) {
			
			System.out.println(Selenium.get(S).getText());
			
			if(Selenium.get(S).getText().equals("Guru99 Demo Page")) {
				
				Selenium.get(S).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[2]")).click();
		
		java.util.List<WebElement> BP = driver.findElements(By.xpath("(//ul[@class=\"dropdown-menu\"])[2]//li"));
		System.out.println(BP.size());
		
	   for(int S1=0;S1<BP.size();S1++) {
		   
		   System.out.println(BP.get(S1).getText());
		   
		   if(BP.get(S1).getText().equals("Bank Project V3")) {
			   
			   BP.get(S1).click();
		   }
	   }
	   
	    Thread.sleep(3000);
		
		driver.navigate().back();
	   
	   driver.findElement(By.xpath("(//a[@data-toggle=\"dropdown\"])[3]")).click();
	   
	   java.util.List<WebElement> SEO =  driver.findElements(By.xpath("(//ul[@class=\"dropdown-menu\"])[3]//li"));
	   System.out.println(SEO.size());
	   
	   for(int S2=0;S2<SEO.size();S2++) {
		   
		   System.out.println(SEO.get(S2).getText());
		   
		   if(SEO.get(S2).getText().equals("Page-6")) {
			   
			   SEO.get(S2).click();
		   }
	   }
		
		
	   Thread.sleep(3000);
		
	   driver.navigate().back();
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("Rohit");
	   
	   driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Sharma");
	   
	   driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	   
	   String Popup = driver.switchTo().alert().getText();
	   System.out.println(Popup);
	   
	   Thread.sleep(3000);
	   
	   driver.switchTo().alert().accept();
	   
	   Thread.sleep(3000);
	   
       driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("Rohit");
	   
	   driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Sharma");
	   
	   WebElement Reset = driver.findElement(By.xpath("//input[@type=\"reset\"]"));
	   Reset.click();
	   
	   File Source = ((TakesScreenshot)Reset).getScreenshotAs(OutputType.FILE);
	   
	   String Random = RandomString.make(4);
	   
	   String Imagename ="Bug";
	 
	   File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
	   
	   FileHandler.copy(Source, Dest);
	   
	   Thread.sleep(3000);
	   
	  driver.quit();
	   
	   
	   
	   

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
