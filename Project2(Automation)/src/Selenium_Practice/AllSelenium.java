package Selenium_Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelenium {
	
	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {

		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			System.out.println("Webdriver method");
			
			driver.get("https://www.facebook.com/");              //get method
			
			driver.manage().window().maximize();                 //maximize method
			
			Thread.sleep(1000);
			
			System.out.println(driver.getCurrentUrl());      //get current url
		
			System.out.println(driver.getTitle());          //get title
			
			Dimension D = new Dimension(200, 400);         //set size method
			driver.manage().window().setSize(D);
			
			Thread.sleep(1000);
			
			System.out.println(driver.manage().window().getSize());    //get size method
			
			Point P = new Point(300, 500);                         //set position method
			driver.manage().window().setPosition(P);
			
			Thread.sleep(1000);
			
			System.out.println(driver.manage().window().getPosition());    //get position method
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			Thread.sleep(1000);
			
			driver.navigate().back();                             //navigate method
			
			Thread.sleep(1000);
			
			driver.navigate().forward();
			
			Thread.sleep(1000);
			
			driver.navigate().refresh();
			
			Thread.sleep(1000);
			
			driver.manage().window().maximize();
			
			System.out.println();
			System.out.println("WebElement methods");
			
			driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("URDCFGV");       //sendkey method
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name=\"radiooptions\"]")).click();                   //click method
			
			Thread.sleep(1000);
			
			String Etext = "Automation Demo Site";
			
			String Atext = driver.findElement(By.xpath("//h1[text()=\"Automation Demo Site \"]")).getText();     //get text method
			System.out.println(Atext);
			
			if(Etext.equals(Atext)) {
				
				System.out.println("Corrct text");
			}
			else {System.out.println("Wrong text");}
			
			boolean S = driver.findElement(By.xpath("//input[@name=\"radiooptions\"]")).isSelected();        //is selected
			System.out.println(S);
			
            boolean S1 = driver.findElement(By.xpath("//img[@id=\"imagetrgt\"]")).isDisplayed();			//is displayed
			System.out.println(S1);
			
			boolean S2 = driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).isEnabled();           //is enabled
			System.out.println(S2);
			
			driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).clear();                 //clear method
			
			Thread.sleep(1000);
			
			System.out.println();
			System.out.println("Listbox");
			
			WebElement Skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));               //Indentify listbox & store it is in referance variable
			
			
			Select D1 = new Select(Skills);                                         //create the object of select class
			List<WebElement> D2 = D1.getOptions();                                  //get option method present in select class
			System.out.println(D2.size());                                          //finding the size list box
			
			for(int a=0;a<D2.size();a++) {
				
				System.out.println(D2.get(a).getText());                             //print the values from list box
				
				if(D2.get(a).getText().equals("Adobe InDesign")) {
					
					D2.get(a).click();                                               //click on perticular value of list box
					
				}
				
			}
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
			
		    List<WebElement> C1 = driver.findElements(By.xpath("//ul[@id=\"select2-country-results\"]//li"));
			System.out.println(C1.size());
			
			for(int b=0;b<C1.size();b++) {
		
			System.out.println(C1.get(b).getText());	
			
			if(C1.get(b).getText().equals("South Africa")) {
				
				C1.get(b).click();
				break;
			}                           
			
				
				
			}
			
			String Y ="//select[@id=\"yearbox\"]//option";
			String M ="//select[@ng-model=\"monthbox\"]//option";
			String Day ="//select[@id=\"daybox\"]//option";
			
			String S8 ="1998/September/20";
			String S7[] = S8.split("/");
			
			m1(Y, S7[0]);
			m1(M, S7[1]);
			m1(Day, S7[2]);
			
			
	}
			
		public static void m1(String W , String S9)	{
			
			List<WebElement> L = driver.findElements(By.xpath(W));
			System.out.println(L.size());
			
			for(int o=0;o<L.size();o++) {
			
				System.out.println(L.get(o).getText());
				
				if(L.get(o).getText().equals(S9)) {
					
					L.get(o).click();
					
				}
			}
			
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
