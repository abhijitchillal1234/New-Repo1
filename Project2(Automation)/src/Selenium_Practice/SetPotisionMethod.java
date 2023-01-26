package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPotisionMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/");                        //get method
		
		driver.manage().window().maximize();                      //maximize method
		
		String Actual1= driver.getCurrentUrl();
		
		System.out.println(Actual1);                             //get current url & compaire two url
		
		String Expected1 = "https://twitter.com/";
		
		if(Expected1.equals(Actual1)) {
			
			System.out.println("Correct Url");
		}
		else {System.out.println("Wrong Url");}
		
		String Actual2 = driver.getTitle();
		
		System.out.println(Actual2);                            //get title & compaire two title
		
		String Expected2 ="Twitter";
		
		if(Expected2.equals(Actual2)) {
			
			System.out.println("Correct Title");
		}
		else {System.out.println("Wrong Title");}
		
		Thread.sleep(3000);
		
		driver.get("https://www.spacex.com/");
				
		Point P = new Point(400, 600);                                    //set position method
		
		driver.manage().window().setPosition(P);
		
		Thread.sleep(3000);
		
		
		System.out.println(driver.manage().window().getPosition());       //get position method
		
		Dimension D = new Dimension(500, 600);                           //set size method
		
		driver.manage().window().setSize(D);
		
		System.out.println(driver.manage().window().getSize());          //get size method
		
		Thread.sleep(3000);
		
		driver.navigate().back();                                       //navigate method(backword,forword,refresh)
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
 		driver.quit();                                                   //quite method
 		
 		driver.close();                                                 //close method
		
		
		
		
		
		
		
		
		
	}

}
