package Page_Object_Model_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHrm_BaseClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

	   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);         //Implicit Wait
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			driver.manage().window().maximize();
			
			FileInputStream File = new FileInputStream("C:\\Users\\Ramesh\\Desktop\\XlSheetForDDF.xlsx");
			
			org.apache.poi.ss.usermodel.Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet1");			
			
			OrangeHrm_Login OL = new OrangeHrm_Login(driver);
			
			String UName1 =Sh.getRow(1).getCell(0).getStringCellValue();
			
			OL.MethodUsername(UName1);
			
			String UPass2 = Sh.getRow(1).getCell(1).getStringCellValue();
			
			OL.MethodPassword(UPass2);
			
			OL.Methodloginbutton();
			
			Thread.sleep(2000);
			
			OrangeHrm_Dashboard OD = new OrangeHrm_Dashboard(driver);
			
			String VD = Sh.getRow(1).getCell(2).getStringCellValue();
			
			OD.MethodValidation1(VD);
			
			String VD1 = Sh.getRow(1).getCell(3).getStringCellValue();
			
			OD.MethodValidation2(VD1);
			
			driver.quit();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
