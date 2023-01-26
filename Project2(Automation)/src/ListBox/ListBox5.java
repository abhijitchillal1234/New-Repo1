package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Rohit");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Sharma");
		
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Rohit1@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9999999");
		
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
		String Date = "1998/September/20";
		String D1[] = Date.split("/");
		
		String Date1 = "1997/January/10";
		String D2[] = Date1.split("/");
	
		List(year,  D1[0]);
		List(month, D1[1]);
		List(day,   D1[2]);
		
		Thread.sleep(2000);
		
		List(year, D2[0]);
		List(month, D2[1]);
		List(day, D2[2]);
		
		}
	
	   public static void List(WebElement E , String S1) {
		   
		   Select S = new Select(E);
		   S.selectByVisibleText(S1);
		   
	   }
	
	
	
	
	
	
	
	

}
