package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Donald");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Trump");
		
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Calfornia , USA");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("donald123@gmial.com");
		
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9087654334678");
		
		driver.findElement(By.xpath("//input[@ng-model=\"radiovalue\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"checkbox3\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		
		Thread.sleep(2000);
		
		
		//List box handle without select class
		List<WebElement> Language = driver.findElements(By.xpath("//ul[@style=\"list-style:none;max-height: 230px;overflow: scroll;\"]//li"));
		System.out.println(Language.size());
		
		for(int a=0;a<Language.size();a++) {
			
			String L = Language.get(a).getText();
			System.out.println(L);
			
			if(L.equals("English")) {
				
				System.out.println("Selected Language"+ L);
				Language.get(a).click();
				
				
			}
			
		}
		
		System.out.println();
		
		//List box handle by select class
		WebElement W = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Thread.sleep(1000);
		
		Select S = new Select(W);                             
	    List<WebElement> S1 = S.getOptions();
	    System.out.println(S1.size());
		
		for(int b=0;b<S1.size();b++) {
			
			String S2 = S1.get(b).getText();
			System.out.println(S2);
			
			if(S2.equals("Backup Management")) {
				
				S1.get(b).click();
				
			}
		}
		
		System.out.println();
		
		//List box handle using select class
        
		driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
		
		List<WebElement> CU = driver.findElements(By.xpath("//ul[@class=\"select2-results__options\"]//li"));
	    System.out.println(CU.size());
	    
	    for(int c=0;c<CU.size();c++) {
	    	
	    	System.out.println(CU.get(c).getText());
	    	
	    	if(CU.get(c).getText().equals("Netherlands")) {
	    		
	    		System.out.println("Selected City is "+  CU.get(c).getText());
	    		CU.get(c).click();
	    		
	    		break;
	    		
	    	}
	    	
	    }
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
