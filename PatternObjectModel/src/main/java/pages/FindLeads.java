package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {
	
	public FindLeads() {
		PageFactory.initElements(driver,this);
	}
	
	//@FindBy(how=How.CLASS_NAME,using="companyName")
	@FindBy(how=How.XPATH,using="//input[@id='ext-gen252']")
	private WebElement cname1;
	public FindLeads typecname(String CName)
	{
		type(cname1,CName);
		return this;
	}
	
	//@FindBy(how=How.CLASS_NAME,using="firstName")
	@FindBy(how=How.XPATH,using="//input[@id='ext-gen248']")
	private WebElement fname;
	public FindLeads typefname(String firstName)
	{
		type(fname, firstName);
		return this;
	}
	
	//@FindBy(how=How.CLASS_NAME,using="lastName")
	@FindBy(how=How.XPATH,using="//input[@id='ext-gen250']")
	private WebElement lname;
	public FindLeads typelname(String lastName)
	{
		type(lname,lastName);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement FindLeadBtn;
	public FindLeads clickFindLead()
	{
	  click(FindLeadBtn);	
	  return this;
	}
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Pooja']")
	private WebElement firstLink;
	public ViewLeadPage clickOnLink()
	{
	  click(firstLink);	
	  return new ViewLeadPage();
	}

}
