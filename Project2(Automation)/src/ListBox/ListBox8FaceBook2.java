package ListBox;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListBox8FaceBook2 {
		
	             static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0\")]")).click();
		
		Thread.sleep(3000);
		
/*		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("fdytfgvtf");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("jhgvj");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("97544589900");
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("RFg@gjhn123");
		
		Thread.sleep(8000);                                  */
		
		String Day   = "//select[@id=\"day\"]//option";
		String Month ="//select[@id=\"month\"]//option";
		String Year  = "//select[@id=\"year\"]//option";

		String DOB = "15-May-2020";
		
		String date[] = DOB.split("-");
		
		Selecteddropdown(Day, date[0]);
		Selecteddropdown(Month, date[1]);
		Selecteddropdown(Year, date[2]);
	
	

		
	}
    
    public static void Selecteddropdown(String element , String value) {
    	
    	List<WebElement> V1 = driver.findElements(By.xpath(element));
    	System.out.println(V1.size());
    	
    	for(int a=0;a<V1.size();a++) {
    		
    		if(V1.get(a).getText().equals(value)) {
    			
    			V1.get(a).click();
    			break;
    		}
    		
    	}
    	
   	
    }
	
	

	
	
	
	
}
