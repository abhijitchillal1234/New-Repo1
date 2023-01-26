package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox6FaceBook1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0\")]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Krishna");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Sharma");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("97544589900");
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("RFg@gjhn123");
		
		Thread.sleep(2000);
		
		WebElement Day   = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year  = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		
		//How will you get the total number of size??
		Select S1 = new Select(Day);
		List<WebElement> Lday = S1.getOptions();
		System.out.println(Lday.size());
		
	
		//How will u print all the values??
			for(int i=0;i<Lday.size();i++) {
			
			String D1 = Lday.get(i).getText();
			System.out.println(D1);
			
			if(D1.equals("20")) {                            //To click on specific element
				
				Lday.get(i).click();
			}
		}
			
			System.out.println();
			
			Select S2 = new Select(Month);                          //Find size of months list box.
			List<WebElement> Lmonth = S2.getOptions();
		    System.out.println(Lmonth.size());
		    
		   for(int a=0;a<Lmonth.size();a++) {                    //To read all the elements
			   
			  String M1 = Lmonth.get(a).getText();
			  System.out.println(M1);
			  
			  if(M1.equals("Sep")) {                          //To click on specific element
				  
				  Lmonth.get(a).click();
			  }
		   }
		   
		   System.out.println();
		   
		   Select S3 = new Select(Year);                       //to get size of elements
		   List<WebElement> Lyear = S3.getOptions();
		   System.out.println(Lyear.size());
		   
		   for(int b=0;b<Lyear.size();b++) {                //to read all the elements
			   
			   String Y1 = Lyear.get(b).getText();
			   System.out.println(Y1);
			   
			   if(Y1.equals("1998")) {                      //to click on specific element
				   
				   Lyear.get(b).click();
			   }
		   }
		   
		   
				   
			
		
		
		
		
		
		
		
		
	}

}
