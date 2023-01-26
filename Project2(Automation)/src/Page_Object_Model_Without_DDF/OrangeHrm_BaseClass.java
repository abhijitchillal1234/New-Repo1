package Page_Object_Model_Without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_BaseClass {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Desktop\\Abhijit\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);         //Implicit Wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.manage().window().maximize();
		
		OrangeHrm_LoginPage OL = new OrangeHrm_LoginPage(driver);
		OL.Logo1();
		OL.Text1();
		OL.Username1();
		OL.Password1();
		
		Thread.sleep(3000);
		
		OL.ForgotPass1();
		OL.loginbutton();
		
		Thread.sleep(3000);
		
		OrangeHrm_Dashboard OD = new OrangeHrm_Dashboard(driver);
		OD.Varifytext1();
		OD.Varifytext2();
		OD.Varifytext3();
		
		Thread.sleep(2000);
		
		OrangeHrm_MyInfo OM = new OrangeHrm_MyInfo(driver);
		OM.Myinfo2();
		OM.TextFN();
		OM.TextLN();
		
		Thread.sleep(2000);

		OrangeHrm_Admin OA = new OrangeHrm_Admin(driver);
		OA.Methodadmin();
		OA.Methodjob();
		OA.Methodjoblist();
		
		Thread.sleep(2000);
		
	//	driver.quit();
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
