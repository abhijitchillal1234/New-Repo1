package Page_Object_Model_Without_DDF;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm_Admin {
	
	@FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
	public WebElement Admin1;
	
	@FindBy(xpath ="(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")
	public WebElement Job;
	
	@FindBy(xpath = "//ul[@class=\"oxd-dropdown-menu\"]//li")
	public List<WebElement> Joblist;
	
	public OrangeHrm_Admin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Methodadmin() {
		
		Admin1.click();
	}
	
	public void Methodjob() {
		
		Job.click();
	}
	
	public void Methodjoblist() {
		
		System.out.println(Joblist.size());
		
		for(int a=0;a<Joblist.size();a++) {
			
			System.out.println(Joblist.get(a).getText());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
