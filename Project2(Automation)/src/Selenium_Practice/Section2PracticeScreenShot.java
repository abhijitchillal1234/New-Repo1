package Selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Section2PracticeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shutterstock.com/search/black-bus");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	    WebElement A = driver.findElement(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item mui-1t5r51c-primaryNavLinkContainer-gridItemContainer\"]"));
		WebElement B = driver.findElement(By.xpath("//div[@class=\"MuiBox-root mui-18mudl3\"]"));
		WebElement C = driver.findElement(By.xpath("//div[@class=\"utility-bar-global-styles mui-pzbwcj-utilityBar-utilityBar\"]"));
		WebElement D = driver.findElement(By.xpath("//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation6 mui-1nqtpys-tooltip\"]"));
		
		
		SS(A);
		SS(B);
		SS(C);
		SS(D);

		

		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
	
	public static void SS(WebElement W ) throws IOException {
		
	    File Source = ((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
		
        String Random = RandomString.make(4);
        
        String Imagename = "BB";
        
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(Source, Dest);
		
		
		
	}

}
