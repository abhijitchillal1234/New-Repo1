package Selenium_Practice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spacex.com/");                      //get method
		
		driver.manage().window().maximize();                       //maximize method
		
		Thread.sleep(3000);
		
		String Actual = driver.getCurrentUrl();
		
		System.out.println(Actual);               //get current url
		
		String Expected = "https://www.spacex.com/";
		
		if(Expected.equals(Actual)) {
			
			System.out.println("Correct Url");
		}
		else {System.out.println("Wrong Url");}
		
		String Actual1 =driver.getTitle();
		System.out.println(Actual1);                   //get title
		
		String Expected1= "SpaceX";
		
		if(Expected1.equals(Actual1)) {
			
			System.out.println("Correct Title");
		}
		else {System.out.println("Wrong Title");}
		
		Dimension D = new Dimension(400, 600);                  //set size
		
		driver.manage().window().setSize(D);

		Thread.sleep(4000);
		
		System.out.println(driver.manage().window().getSize());   //get size
		
		Point P = new Point(500, 300);                          //set position
		
		driver.manage().window().setPosition(P);
		
		Thread.sleep(4000);
		
		System.out.println(driver.manage().window().getPosition());     //get position
		
		driver.get("https://www.google.com/maps/");
		
		Thread.sleep(4000);
		
		driver.navigate().back();                                   //navigate method
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		driver.quit();                                               //quite method
		
	//	driver.close();                                              //close method
		
		
		
		
		
		
		
		
		
		
	}

}
