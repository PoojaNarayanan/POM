package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {

	public EditLead() {
		PageFactory.initElements(driver,this);
	}
	
	//@FindBy(how=How.CLASS_NAME,using="companyName")
	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement cname1;
	public EditLead  updatecname()
	{
		
		type(cname1,"Google");
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='ext-gen633']")
	private WebElement clickUpdate;
	public ViewLeadPage clickUpdateBtn()
	{
		click(clickUpdate);
		return new ViewLeadPage();
	}
	
}
