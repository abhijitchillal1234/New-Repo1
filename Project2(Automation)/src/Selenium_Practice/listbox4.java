package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox4 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();        //list box handle without select class
		
		Thread.sleep(2000);
		
		List<WebElement> Language = driver.findElements(By.xpath("//ul[contains(@class,\"ui-autocomplete ui-\")]//li"));
		System.out.println(Language.size());
		
		for(int a=0;a<Language.size();a++) {
			
			System.out.println(Language.get(a).getText());
			
			if(Language.get(a).getText().equals("Slovenian")) {
			
				Language.get(a).click();
				
			}
			
		}
	
		System.out.println();
		
		WebElement Skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Select Skills1 = new Select(Skills);
		List<WebElement> Skills2 = Skills1.getOptions();
		System.out.println(Skills2.size());
		
		for(int b=0;b<Skills2.size();b++) {
			
			System.out.println(Skills2.get(b).getText());
			
			if(Skills2.get(b).getText().equals("Word Processing")) {
				
				Skills2.get(b).click();
				
			}
			
		}
		
		System.out.println();
		
		driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
		
		List<WebElement> Country = driver.findElements(By.xpath("//ul[@id=\"select2-country-results\"]//li"));
		System.out.println(Country.size());
		
		for(int c=0;c<Country.size();c++) {
			
			System.out.println(Country.get(c).getText());
			if(Country.get(c).getText().equals("New Zealand")) {
				
				Country.get(c).click();
				break;
			}
			
		}
		
		System.out.println();
		
               String year =  "//select[@id=\"yearbox\"]";
               String month=  "//select[@placeholder=\"Month\"]";
               String day =   "//select[@id=\"daybox\"]";
               
               String B ="1998/September/20";
               String C []= B.split("/");
               
               A1(year, C[0]);
               A1(month, C[1]);
               A1(day, C[2]);               
               
 
               driver.quit();
                
	}
	public static void A1 (String element , String value) {	
		
		List<WebElement> S1 =driver.findElements(By.xpath(element));
		
		
		for(int i=0;i<S1.size();i++) {
			
			System.out.println(S1.get(i).getText());
			
			if(S1.get(i).getText().equals(value)) {
				
				S1.get(i).click();
				
			}
		}
		
	}
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
