package Locator;
                                       
                                      //Xpath By Test-------------    
                                          //Syntex:://tagname[test()="textvalue"]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {

	  //classname.methodname
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("abhijit29@gmail.com");  //--Xpath By Attribute
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _9npi inputtext _9npi\"]")).sendKeys("Abhi1234"); //-Xpath By Attribute
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();      //--------------------------------------------------Xpath By Text
		
		Thread.sleep(7000);
		
		driver.quit();
		
		
		
		
		
     
	
		
		
		
		
		
	}

}
