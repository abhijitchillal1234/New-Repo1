package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_With_DDF {
	
	//Using DDF-------------------
	 //Using DDf we are add values from xl sheet. so that we have not require to change test data every time from test case, 
	        //we change the values frome xl sheet only.

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		FileInputStream File = new FileInputStream("C:\\Users\\Ramesh\\Desktop\\XlSheetForDDF.xlsx");
		
		Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet1");
		
		String Username = Sh.getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username); 
		
		Thread.sleep(1000);
		
		String Password = Sh.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password); 
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(1000);
		
		String ActualValue = Sh.getRow(1).getCell(2).getStringCellValue();
		System.out.println(ActualValue); 
		
		String ExpectedValue = "123 5236";
		
		if(ExpectedValue.equals(ActualValue)) {
			
			System.out.println("Correct User");
		}
		else {System.out.println("Wrong User");}

        driver.quit();
		
	}

}
