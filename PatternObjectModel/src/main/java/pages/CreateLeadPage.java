package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement ClickCreateLead;

	//smallSubmit
	@And("Enter Company Name(.*)") 
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(eleCompanyName,cName);
		return  new CreateLeadPage();
	}
	@And("Enter FirstName(.*)")
	public CreateLeadPage typeFirstName(String fname)
	{
		type(eleFirstName,fname);
		return new CreateLeadPage();
	}
	@And("Enter LastName(.*)")
	public CreateLeadPage typeLastName(String lname)
	{
		type(eleLastName,lname);
		return new CreateLeadPage();
	}
	@When("Click on Create Lead")
     public ViewLeadPage ClickCreateLeadButton()
     {
    	 click(ClickCreateLead);
    	 return new ViewLeadPage();
     }
	
	
	
}
