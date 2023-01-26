package Page_Object_Model_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm_Login {
	
	@FindBy(xpath ="//input[@name=\"username\"]")
	public WebElement Username;
	
	@FindBy(xpath ="//input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath ="//button[@type=\"submit\"]")
	public WebElement Loginbutton;
	
	public OrangeHrm_Login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void MethodUsername(String User) {
		
		Username.sendKeys(User);
	}
	
	public void MethodPassword(String Pass) {
		
		Password.sendKeys(Pass);
	}
	
	public void Methodloginbutton() {
		
		Loginbutton.click();
	}
	
	
	
	
	
	
	
	

}
