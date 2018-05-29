package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement checkFirstName;
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement checkCompanyName;
	
	@FindBy(how=How.LINK_TEXT,using="Logout")
	private WebElement ClickLogout;
	
	public ViewLeadPage verifyFirstName(String data)
	{
       verifyExactText(checkFirstName, data);
		return new ViewLeadPage();
	}
	public ViewLeadPage verifyTitle()
	{
	  getTitle().compareTo("View Lead | opentaps CRM");
	  return this;
	}
	public ViewLeadPage verifyCompanyName(String cName)
	{
		verifyExactText(checkCompanyName, cName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@id='ext-gen599']")
	private WebElement clickEdit;
	
	public EditLead clickEditLead()
	{
		click(clickEdit);
		return new  EditLead();
	}
	
	public void ClickLogout()
	{
		click(ClickLogout);
	    closeBrowser();
	}
}
