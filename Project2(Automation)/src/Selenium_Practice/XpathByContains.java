package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

                                        
                                       //Xpath By Conmtains-----------
                                            
                                              //1-Contains By Attributes---
                                                      //Syntex----//tagname[contains(atrributename,"atrributevalue")]

                                            //2-Contains By Text-----
                                                     //Syntex---//tagname[contains(text(),"textvalue")]

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[contains(@name,\"email\")]")).sendKeys("abhijitchillal2829@gmail.com");    //---Contains By Attribute   
		
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("Abhi123456");   //---------Contains By Attribute

        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//button[contains(text(),\"Lo\")]")).click();                    //------------Contains By Text

        Thread.sleep(3000);
        
        driver.quit();
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
