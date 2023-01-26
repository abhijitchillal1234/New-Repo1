package MultipleLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks5 {

	public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);         //Implicit Wait
		
		driver.get("https://www.guru99.com/");
	
		driver.manage().window().maximize();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		int Brokenlinks =0 ;
		
		for(int a=0;a<Links.size();a++) {
			
		            String link = Links.get(a).getAttribute("href");
			
			if(link==null || link.isEmpty()) {
				
				System.out.println("Link is empty");
				continue;
				
			}
			
			URL url = new URL(link);
			
			HttpURLConnection httpcode = (HttpURLConnection)url.openConnection();
			
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) {
				
				System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Broken Link");
				Brokenlinks++;
			}
			
			else {System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Valid Link");}
			
		    	
		}
		
		System.out.println("Number of Broken Links are :"+Brokenlinks);
		
		driver.quit();
	}

}
