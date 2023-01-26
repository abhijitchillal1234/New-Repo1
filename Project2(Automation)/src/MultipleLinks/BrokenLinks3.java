package MultipleLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.tutorialspoint.com/index.htm");
			
			java.util.List<WebElement> Links = driver.findElements(By.tagName("a"));
			System.out.println(Links.size());
			
			int Brokenlink=0;
			
			for(WebElement W : Links) {
				
				String url = W.getAttribute("href");
				
				if(url==null || url.isEmpty()) {
					
					System.out.println("Url is empty");
					continue;
				}
				
				URL link = new URL(url);
				
				HttpURLConnection httpcode = (HttpURLConnection)link.openConnection();
				
				httpcode.connect();
				
				if(httpcode.getResponseCode()>=400) {
					
					System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Broken Link");
					Brokenlink++;
				}
				else {
					
					System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Valid Link");
				}
			}
			System.out.println("Total number of broken link :"+Brokenlink);
			
			Thread.sleep(3000);
			
			driver.quit();

	}

}
