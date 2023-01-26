package AutomatedPages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;


public class Nopcommerce {		

	public static void main(String[] args) throws InterruptedException, IOException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
             
             WebDriver driver = new ChromeDriver();
             
             driver.manage().window().maximize();
             
             driver.get("https://demo.nopcommerce.com/");
             
             Thread.sleep(2000);
             
             driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
             
             Thread.sleep(1000);
             
             driver.findElement(By.id("gender-male")).click();
             
             Thread.sleep(1000);
             
             driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).sendKeys("Rohit");
             
             Thread.sleep(1000);
             
             driver.findElement(By.id("LastName")).sendKeys("Sharma");
             
             Thread.sleep(1000);
             
            WebElement Day =  driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
            WebElement Month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
            WebElement Year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
            
            Listbox(Day, "20");
            Listbox(Month, "January");
            Listbox(Year, "1998");
            
            Thread.sleep(3000);
            
            driver.findElement(By.id("Email")).sendKeys("Rohit113@gmail.com");
            
            Thread.sleep(1000);
            
            driver.findElement(By.id("Password")).sendKeys("Rohit1234");
            
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Rohit1234");
            
            Thread.sleep(1000);
            
            WebElement Submit = driver.findElement(By.id("register-button"));
            
            JavascriptExecutor Js = (JavascriptExecutor) driver;
            
            Js.executeScript("arguments[0].scrollIntoView();", Submit);
            
            Thread.sleep(2000);
            
            Submit.click();
            
            Thread.sleep(3000);
            
           WebElement Login =  driver.findElement(By.xpath("//a[text()=\"Log in\"]"));
            
       /*     Js.executeScript("arguments[0]scrollIntoView();", Login);
            
            Thread.sleep(1000);                */
            
          Login.click();
          
          Thread.sleep(1000);
          
          driver.findElement(By.id("Email")).sendKeys("Rohit113@gmail.com");
          
          driver.findElement(By.id("Password")).sendKeys("Rohit1234");
          
          driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
          
         Thread.sleep(2000);
         
         WebElement Money = driver.findElement(By.id("customerCurrency"));
         
         Listbox(Money, "US Dollar");
         
         Thread.sleep(1000);
         
         List<WebElement> Category = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a"));
         System.out.println(Category.size());
         
         for(int b=0;b<Category.size();b++) {
        	 
        	 System.out.println(Category.get(b).getText());
        	 
        	 if(Category.get(b).getText().equals("Computers")) {
        		 
        		 Category.get(b).click();
        		 break;
        		 
        	 }
        	 
         }
         
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
         
         Thread.sleep(1000);
         
         WebElement Sort = driver.findElement(By.id("products-orderby"));
         
         Js.executeScript("arguments[0].scrollIntoView();", Sort);
         
         Thread.sleep(1000);
         
         WebElement Pages = driver.findElement(By.id("products-pagesize"));
         
         Listbox(Sort, "Position");
         Listbox(Pages, "6");
         
         Thread.sleep(2000);
         
         WebElement Screen = driver.findElement(By.xpath("//div[@class=\"page category-page\"]"));
         
         Screenshot(Screen);
         
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//a[text()=\"Apple MacBook Pro 13-inch\"])[2]")).click();
         
         Thread.sleep(1000);
         
         driver.findElement(By.id("add-to-wishlist-button-4")).click();
         
         Thread.sleep(1000);
         
         String Wish = driver.findElement(By.xpath("//p[@class=\"content\"]")).getText();
         System.out.println(Wish);
         
         driver.findElement(By.xpath("//span[@title=\"Close\"]")).click();
         
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//span[@class=\"wishlist-label\"]")).click();
         
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//input[@name=\"addtocart\"]")).click();
         
         Thread.sleep(1000);
         
         WebElement Cart = driver.findElement(By.xpath("//button[text()=\"Add to cart\"]"));
         
         Js.executeScript("arguments[0].scrollIntoView();", Cart);
         
         Cart.click();
         
         Thread.sleep(1000);
         
         String Shopping = driver.findElement(By.xpath("//h1[text()=\"Shopping cart\"]")).getText();
         System.out.println(Shopping);
         
         WebElement Screen1 = driver.findElement(By.xpath("//div[@class=\"deals\"]"));
         
         WebElement Screen2 = driver.findElement(By.xpath("//div[@class=\"total-info\"]"));
         
         Screenshot(Screen1);
         Screenshot(Screen2);
         
         Thread.sleep(1000);
         
         WebElement Checkout = driver.findElement(By.id("termsofservice"));
         
         Js.executeScript("arguments[0].scrollIntoView();", Checkout);
         
         Checkout.click();
         
         Thread.sleep(1000);
         
         driver.findElement(By.id("checkout")).click();
         
         Thread.sleep(1000);
         
         List<WebElement> Checkout1 = driver.findElements(By.xpath("//ol[@class=\"opc\"]//li")); 
         System.out.println(Checkout1.size());
         
         for(int c=0;c<Checkout1.size();c++) {
        	 
        	 System.out.println(Checkout1.get(c).getText());
      
         }
         
         Thread.sleep(1000);
         
         
         
            
            
            
            
             
                         
             

             
             
             
             
             
             
             
             }
	
	

			public static void Listbox(WebElement W , String S2 ) {
	        	
	        	Select S = new Select(W);
	        	java.util.List<WebElement> S1 = S.getOptions();
	        	System.out.println(S1.size());
	        	
	        	for(int a=0;a<S1.size();a++) {
	        		
	        		System.out.println(S1.get(a).getText());
	        		
	        		if(S1.get(a).getText().equals(S2)) {
	        			
	        			S1.get(a).click();
	        			break;
	        		}
	        	}
	        	
	        }
			
			public static void Screenshot(WebElement Web) throws IOException {
				
				File Source = ((TakesScreenshot)Web).getScreenshotAs(OutputType.FILE);
				
				String Random = RandomString.make(4);
				
				String Imagename = "NopCommerce";
				
				File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
				
				FileHandler.copy(Source, Dest);
				
				
				
				
			}



		
	        
	        
	        
	        
             
             
            		 
            		 
		
			
		}
		
		
		
		
	


