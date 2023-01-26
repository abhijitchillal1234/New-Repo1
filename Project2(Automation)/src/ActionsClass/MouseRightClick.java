package ActionsClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	
	//To Mouse right click we use the "contextClick" method which is non-static method from actions class.


	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");		
		
        Thread.sleep(3000);
        
        WebElement Element = driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
        
        Actions AC = new Actions(driver);
        
        AC.contextClick(Element).perform();       //Syntax is used to Right click on the element
        
        Thread.sleep(3000);
        
        WebElement Element1 = driver.findElement(By.xpath("//span[text()=\"Copy\"]"));
        
        AC.contextClick(Element1).perform();    //Syntax is used to Right click on the element
        
        Thread.sleep(3000);
        
        String Textpopup = driver.switchTo().alert().getText();            //Syntax is used to get text from popup
        System.out.println(Textpopup);
        
        Thread.sleep(3000);
        
        driver.switchTo().alert().accept();                                //Syntax is used to click on ok button on popup
        
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
