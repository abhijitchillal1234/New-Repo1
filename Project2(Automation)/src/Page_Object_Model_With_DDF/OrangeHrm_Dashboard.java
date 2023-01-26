package Page_Object_Model_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm_Dashboard {
	
	@FindBy(xpath ="//p[@class=\"oxd-userdropdown-name\"]")
	public WebElement Uname;
	
	@FindBy(xpath="//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")
	public WebElement Pagename1;
	
	public OrangeHrm_Dashboard(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void MethodValidation1(String ValidationName) {
		
		System.out.println(Uname.getText());
		
		if(ValidationName.equals(Uname.getText())) {
			
			System.out.println("Correct Username");
		}
		else {System.out.println("Wronge Username");}
	}
	
	public void MethodValidation2(String Pagename) {
		
		System.out.println(Pagename1.getText());
		
		if(Pagename.equals(Pagename1.getText())) {
			
			System.out.println("Correct page name");
		}
		else {System.out.println("Wronge page name");}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
