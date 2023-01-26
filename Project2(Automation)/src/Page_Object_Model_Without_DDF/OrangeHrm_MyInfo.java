package Page_Object_Model_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm_MyInfo {

	@FindBy(xpath ="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]")
	public WebElement MyInfo1;
	
	@FindBy(xpath = "//h6[@class=\"oxd-text oxd-text--h6 --strong\"]")
	public WebElement Name;
	
	@FindBy(xpath = "//h6[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]")
	public WebElement Personaldetails;
	
	public OrangeHrm_MyInfo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Myinfo2() {
		
		MyInfo1.click();
	}
	
	public void TextFN() {
		
		System.out.println(Name.getText());
	}
	
	public void TextLN() {
		
		System.out.println(Personaldetails.getText());
	}

}
