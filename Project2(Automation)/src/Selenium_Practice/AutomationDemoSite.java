package Selenium_Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AutomationDemoSite {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("UTTGNOUUN");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("TFYGHKJHIUJH");
		
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("UTDCHGKILUEASYJYY");
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("UTTGNOUUN123@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("7547894326879");
		
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"checkbox3\"]")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		
		List<WebElement> Language = driver.findElements(By.xpath("//ul[contains(@class,\"ui-autocomplete ui\")]//li"));
		System.out.println(Language.size());
		
		for(int a=0;a<Language.size();a++) {
			
			System.out.println(Language.get(a).getText());
			
			if(Language.get(a).getText().equals("Norwegian")) {
				
				Language.get(a).click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		
		System.out.println();
		
		WebElement Skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Select Skills1 = new Select(Skills);
		List<WebElement> Skills2 = Skills1.getOptions();
		System.out.println(Skills2.size());
		
		for(int b=0;b<Skills2.size();b++) {
			
			System.out.println(Skills2.get(b).getText());
			
			if(Skills2.get(b).getText().equals("APIs")) {
				
				Skills2.get(b).click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		
		System.out.println();
		
		driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).click();
		
		List<WebElement> Country = driver.findElements(By.xpath("//ul[@class=\"select2-results__options\"]"));
		System.out.println(Country.size());
		
		for(int c=0;c<Country.size();c++) {
			
			System.out.println(Country.get(c).getText());
			
			if(Country.get(c).getText().equals("India")) {
				
				Country.get(c).click();
				break;
			}
				
		}
		
		System.out.println();
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		WebElement month= driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day =driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
		String S1 = "1969/October/2";
		String S2[] = S1.split("/");
		
		DOB(year, S2[0]);
		DOB(month, S2[1]);
		DOB(day, S2[2]);
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("SDTHIIKUJG");
        
        driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("SDTHIIKUJG");
        
        Thread.sleep(3000);
        
        driver.quit();
		
		
	}

	public static void DOB(WebElement W , String S) {
		
		Select DOB1 = new Select(W);
		List<WebElement> DOB2 = DOB1.getOptions();
		System.out.println(DOB2.size());
		
		for(int d=0;d<DOB2.size();d++) {
			
		System.out.println(DOB2.get(d).getText());
		
		if(DOB2.get(d).getText().equals(S)) {
			
			DOB2.get(d).click();
			
		}
			
		}
		
		
	}
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		

	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


