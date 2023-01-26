package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {


	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_0\")]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rohit");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9999999999");
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("@#$$TYFHU");
		
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		WebElement month =driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		
		
		String DOB = "22/4/2020";
		String Date[] = DOB.split("/");
		
		Listbox(day, Date[0]);
		Listbox(month, Date[2]);
		Listbox(year, Date[6]);
		
		
		
	}
		
		
    	public static void Listbox(WebElement element , String value) {
    		
    		Select S = new Select(element);
    		S.selectByValue(value);
    		
    	} 	
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
