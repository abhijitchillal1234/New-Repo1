package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {
	
	//To Mouse double click we use the "doubleClick()" method which is non-static method from actions class.


	public static void main(String[] args) throws InterruptedException {

     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");		
		
        Thread.sleep(3000);
        
        Actions AC = new Actions(driver);             //object of actions class to perform various mouse over actions
        
        WebElement Element2 = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
        
        AC.doubleClick(Element2).perform();         //Syntax to double click on the element
        
        Thread.sleep(3000);
        
        String Text2 = driver.switchTo().alert().getText();
        System.out.println(Text2);
        
        Thread.sleep(3000);
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(3000);
        
        driver.quit();
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}

}
