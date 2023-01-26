package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	//	driver.findElement(By.xpath("//img[@id=\"disha-banner-close\"]")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//a[@class=\"fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).sendKeys("Mumbai");
		
		
		Thread.sleep(3000);
		
        List<WebElement> From = driver.findElements(By.xpath("//ul[contains(@id,\"pr_id_\")]//li"));
        System.out.println(From.size());
		
        for(int a=0;a<From.size();a++) {
        	
        	String F = From.get(a).getText();
        	System.out.println(F);
        	
        	if(F.equals("MUMBAI CENTRAL - MMCT")) {
        		
        		From.get(a).click();
        	}
        	
        }
        
        Thread.sleep(1000);
        
        System.out.println();
        
        driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[2]")).sendKeys("Solapur");
		
        Thread.sleep(1000);
        
        List<WebElement> To = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
        System.out.println(To.size());
        
        for(int b=0;b<To.size();b++) {
        	
        	String T = To.get(b).getText();
        	System.out.println(T);
        	
        	if(T.equals("SOLAPUR JN - SUR")) {
        		
        		To.get(b).click();
        	}
        }
        
        Thread.sleep(2000);
        
        System.out.println();
        
        driver.findElement(By.xpath("//p-dropdown[@id=\"journeyQuota\"]")).click();
        
        Thread.sleep(2000);
        
        
        List<WebElement> Q = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
        System.out.println(Q.size());
        
        for(int c=0;c<Q.size();c++) {
        	
        	String Q1 = Q.get(c).getText();
        	System.out.println(Q1);
        	
        	if(Q1.equals("TATKAL")) {
        		
        		Q.get(c).click();
        	}
        }
			
		Thread.sleep(3000);
		
		System.out.println();
		
		driver.findElement(By.xpath("//p-dropdown[@id=\"journeyClass\"]")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> C = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		System.out.println(C.size());
		
		for(int d=0;d<C.size();d++) {
			
			String C1 = C.get(d).getText();
			System.out.println(C1);
			
			if(C1.equals("Vistadome Non AC (VS)")) {
				
				C.get(d).click();
			}
		}
		
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
