package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//If select class is not present then how to handle list box	
//If select class is not present then how to handle list box

public class ListBox7RedBus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		
		Thread.sleep(5000);
		
		List<WebElement> City = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println(City.size());
		
		Thread.sleep(5000);
		
		for(int i=0;i<City.size();i++) {
			
				System.out.println(City.get(i).getText());
				
			if(City.get(i).getText().equals("Pimpri Chinchwad, Pune")) {
				
				System.out.println("Seleced City"+ City.get(i).getText());
				
				City.get(i).click();
				
				break;
			}                                             
				}
		
		System.out.println();
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Solpaur");
		
		Thread.sleep(2000);
		
		List<WebElement> To = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println(To.size());
		
		for(int a=0;a<To.size();a++) {
			
			String S = To.get(a).getText();
			System.out.println(S);
			
			if(S.equals("Solapur")) {
				
				System.out.println("Selected City "+S);
				
				To.get(a).click();
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()=\"Date\"]")).click();
		
		driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\"Search Buses\"]")).click();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
