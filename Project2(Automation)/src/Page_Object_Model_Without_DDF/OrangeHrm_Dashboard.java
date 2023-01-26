package Page_Object_Model_Without_DDF;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHrm_Dashboard {
	
	//1)Data member should be declared globally with access level private/public---------------------
	
	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
	public WebElement Text1;
	
	@FindBy(xpath = "(//p[@class=\"oxd-text oxd-text--p\"])[4]")
	public WebElement Text2;
	
	@FindBy(xpath = "(//p[@class=\"oxd-text oxd-text--p\"])[8]")
	public WebElement Text3;
	

	//2)Initialize within a constructor with access level public using pagefactory------------------------
	
	public OrangeHrm_Dashboard(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	} 
	
	//3)Create the methods----------------
	
	public void Varifytext1() {
		
		System.out.println(Text1.getText());
	}
	
	public void Varifytext2() {
		
		System.out.println(Text2.getText());
	}
	
	public void Varifytext3() {
		
		System.out.println(Text3.getText());
	}
	

	
	
	
	
	
	
	
	
	
	
	

}
