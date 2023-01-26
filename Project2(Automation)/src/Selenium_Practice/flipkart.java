package Selenium_Practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0\")]")).click();
		
		Thread.sleep(1000);
		
		boolean D = driver.findElement(By.xpath("//div[@class=\"_3ixn\"]")).isDisplayed();
		System.out.println(D);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Roberto");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Aziwedo");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("robert123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("robert123@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("IOUHYGTCVB");
		
		Thread.sleep(2000);
		
		WebElement day    = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year   = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Select Sday = new Select(day);
		List<WebElement> D1 = Sday.getOptions();                   //to find size of the list
		System.out.println(D1.size());
		
		for(int a=0;a<D1.size();a++) {
			
			String D2 = D1.get(a).getText();
			System.out.println(D2);
			
			if(D2.equals("20")) {
				
				D1.get(a).click();
			}
		}
		
		System.out.println();
		
		Select Smonth = new Select(month);
		List<WebElement> M1 = Smonth.getOptions();
		System.out.println(M1.size());                                 //to find size of the list
		
		for(int b=0;b<M1.size();b++) {
			
			String M2 =M1.get(b).getText();
			System.out.println(M2);
			
			if(M2.equals("Sep")) {
				
				M1.get(b).click();                                  //to click on the specific element
			}
		}
		
		System.out.println();
		
		Select Syear = new Select(year);
		List<WebElement> Y1 = Syear.getOptions();
		System.out.println(Y1.size());
		
		for(int c=0;c<Y1.size();c++) {
			
			String Y2 =Y1.get(c).getText();
			System.out.println(Y2);
			
			if(Y2.equals("1998")) {
				
				Y1.get(c).click();
			}
		}
		
		
		
		
		

		
	
		
		
		
		
		
		
		
		
		
		
	}

}
