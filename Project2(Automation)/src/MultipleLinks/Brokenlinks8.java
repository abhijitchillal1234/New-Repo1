package MultipleLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks8 {

	public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);         //Implicit Wait
		
		driver.get("https://www.amazon.in/");
	
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int Brokenlinks=0;
		
		for(int a=0;a<links.size();a++) {
			
			String Links = links.get(a).getAttribute("href");
			
			if(Links==null || Links.isEmpty()) {
				
				System.out.println("Url is empty");
				Brokenlinks++;
			}
			
	try {		URL url = new URL(Links);
			
			HttpsURLConnection httpcode = (HttpsURLConnection)url.openConnection();
			
			httpcode.connect();
			
			if(httpcode.getResponseCode()>400) {
				
				System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Broken Links");
			}
			
			else {System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Valid Link");}
	
		}catch(MalformedURLException e) {
			
			System.out.println(e.getMessage());
		}
	
		}
		
		System.out.println("Number of broken links are :"+Brokenlinks);
		
		
	}
	
}


