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

public class BrokenLinks7 {

	public static void main(String[] args) throws IOException {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			List<WebElement> Ele =driver.findElements(By.tagName("a"));
			System.out.println(Ele.size());
			
			int BrokenLinks =0 ;
			
			for(int a =0;a<Ele.size();a++) {
				
				
				String link = Ele.get(a).getAttribute("href");
				
				if(link==null || link.isEmpty()) {
					
					System.out.println("Url is empty");
					continue;
				}
				
try {			URL url = new URL(link);
				
				HttpURLConnection httpcode = (HttpURLConnection)url.openConnection();
				
				httpcode.connect();
				
				if(httpcode.getResponseCode()>=400) {
					
					System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Broken Link");
					BrokenLinks++;
				}
				
				else {
					System.out.println(httpcode.getResponseCode()+"--->>"+url+"is--->>"+"Valid Link");
				}
				
			}catch(MalformedURLException e) {
				
				System.out.println(e.getMessage());
			}

			}
			System.out.println("Number of broken links are :"+BrokenLinks);
		
		driver.quit();	
	}

}
