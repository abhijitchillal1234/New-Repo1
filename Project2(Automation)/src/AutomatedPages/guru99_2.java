package AutomatedPages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;


public class guru99_2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V4/");
		
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//a[text()=\"here\"]")).click();
		 
		 Thread.sleep(6000);
		 
		String Text = driver.findElement(By.xpath("//h2[contains(text(),\"Enter\")] ")).getText();
		System.out.println(Text);
		
		driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("donald123@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		 driver.get("https://demo.guru99.com/access.php?uid=mngr462866%20&%20pass=unumugy%20&%20email=donald123@gmail.com");
		
        Thread.sleep(4000);
		
		Screenshot(driver);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mngr462866");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("unumugy");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Thread.sleep(2000);
		
		String Text1 = driver.findElement(By.xpath("//marquee[contains(text(),\"Wel\")]")).getText();
		System.out.println(Text1);
		
		String Text2 = driver.findElement(By.xpath("//td[contains(text(),\"Ma\")]")).getText();
		System.out.println(Text2);
		
		List<WebElement> Corner = driver.findElements(By.xpath("//ul[@class=\"menusubnav\"]//li"));
		System.out.println(Corner.size());
		
		for(int a=0;a<Corner.size();a++) {
			
			System.out.println(Corner.get(a).getText());
			
			if(Corner.get(a).getText().equals("New Customer")) {
				
				Corner.get(a).click();
				break;
			}
		}
			
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Ravan");
		
		driver.findElement(By.id("dob")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@onkeyup=\"validateAddress();\"]")).sendKeys("Calfornia , Usa");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Calfornia");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Calfornia");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("413006");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("988765433236");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[6]")).sendKeys("donald123@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Donald1234");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//textarea[@onkeyup=\"validateAddress();\"]")).clear();
		
		driver.findElement(By.xpath("//textarea[@onkeyup=\"validateAddress();\"]")).sendKeys("Calfornia  Usa");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String Textpopup = driver.switchTo().alert().getText();
		System.out.println(Textpopup);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		for(int a=0;a<Corner.size();a++) {
			
			System.out.println(Corner.get(a).getText());
			
			if(Corner.get(a).getText().equals("Edit Customer")) {
				
				Corner.get(a).click();
				break;
			}
		}
		
	
			
			
			
			
			
		}
		
		
		
		
		
	
	
	public static void Screenshot(WebDriver driver) throws IOException {
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(4);
		
		String Imagename = "guru99";
		
		File Dest = new File("C:\\Users\\Ramesh\\Desktop\\ScreenShots\\"+Imagename+""+Random+".jpg"); 
		
		FileHandler.copy(Source, Dest);
		
		
		
	}
	
}




