package Page_Object_Model_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm_LoginPage {
	
	//1)Data member should be declare globally with access level public/private------------------>>>>>>>>>>>>>>>>>>
	
	@FindBy(xpath ="//div[@class=\"orangehrm-login-branding\"]")           //FindBy is interface (Xpath is the method from that interface)
	public WebElement Logo;
	
	@FindBy(xpath ="//h5[text()=\"Login\"]")
	public WebElement Text;
	
	@FindBy(xpath ="//input[@name=\"username\"]")
	public WebElement Username;
	
	@FindBy(xpath ="//input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath ="//button[@type=\"submit\"]")
	public WebElement Loginbutton;
	
	@FindBy(xpath ="//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
	public WebElement Forgotbutton;
	
	//2)Initialize within constructor with access level public using pagefactory------------>>>>>>>>>>>>>
	
	public OrangeHrm_LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);                        //Pagefactory is the class. All the method from that is static methods
	}
	
	//3)Create the methods--------------->>>>>>>>>>>
	
	public void Logo1() {
		
		boolean B = Logo.isDisplayed();
		System.out.println(B);
	}
	
	public void Text1() {
		
		String T = Text.getText();
		System.out.println(T);
	}
	
	public void Username1() {
		
		Username.sendKeys("Admin");
	}
	
	public void Password1() {
		
		Password.sendKeys("admin123");
	}
	
	public void ForgotPass1() {
		
		boolean B1 = Forgotbutton.isEnabled();
		System.out.println(B1);
	}
	
	public void loginbutton() {
		
		Loginbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
