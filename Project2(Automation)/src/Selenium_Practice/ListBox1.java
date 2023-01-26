package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("AETHBVFJ");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("VGUUHFG");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("UFBYAADFJBUYHBWRFGYU");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("OUBFBCVFHV@gmai.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("937846373829");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		
		Thread.sleep(1000);
		
	    boolean b = driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).isSelected();
	    System.out.println(b);
	    
	    Thread.sleep(1000);
	    
	   WebElement W =  driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	   W.clear();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("JWRHDB");
	   
	   boolean b1 = driver.findElement(By.xpath("//img[@id=\"imagetrgt\"]")).isDisplayed();
	   System.out.println(b1);
	   
	   driver.findElement(By.xpath("//input[@id=\"checkbox3\"]")).click();
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
	   
	   Thread.sleep(2000);
	   
	  WebElement Y = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
	  WebElement M = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
	  WebElement D = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
	  
	 String A = "1998/September/20";
	 String B[] = A.split("/");
	 
	 m1(Y, B[0]);
	 m1(M, B[1]);
	 m1(D, B[2]);
	 
	 Thread.sleep(2000);
	 
	 String A1 = "2000/February/29";
	 String B1[] =A1.split("/");
	 
	 m1(Y, B1[0]);
	 m1(M, B1[1]);
	 m1(D, B1[2]);
	 
	 boolean z = driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).isEnabled();
	 System.out.println(z);
	 
	 
	 
	   
	}
	
	public static void m1(WebElement W , String S) {
		
		Select S7 = new Select(W);
		S7.selectByValue(S);
		
	}
	   
	   
	   
	   
	    
	 
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
