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

public class BrokenLinks4 {

	public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\"Computers \"]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		int BrokenLinks = 0 ;
		
		for(int a=0;a<Links.size();a++) {
			
			String links = Links.get(a).getAttribute("href");
			
			if(links==null || links.isEmpty()) {
				
				System.out.println("Url is empty");
			}
			
			URL U = new URL(links);
			
			HttpURLConnection httpcode = (HttpURLConnection)U.openConnection();
			
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) {
				
				System.out.println(httpcode.getResponseCode()+"-->>"+U+"is-->>"+"Broken Link");
				BrokenLinks++;
			}
			
			else {System.out.println(httpcode.getResponseCode()+"-->>"+U+"is-->>"+"Valid Link");
			
			}
			
		}
		System.out.println("Number of broken links are :"+BrokenLinks);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
