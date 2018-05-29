package teststeps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	/*
	protected RemoteWebDriver driver;
	
	
	 @Given("open the browser")
	 public void openBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
	 }
	
	    @And("Maximize the browser.")
	    public void maxBrowser()
	    {
	    	driver.manage().window().maximize();
	    }
	    @And("Set timeout.")
	    public void setTimeout()
	    {
	    	
	    }
	    @And("Enter URL.")
	    public void enterURL()
	    {
	    	driver.get("http://leaftaps.com/opentaps/control/main");
	    }
	    @And ("Enter UserName.")
	    public void enterUserName()
	    {
	    	driver.findElementById("username").sendKeys("DemoSalesManager");
	    }
	    @And("Enter Password.")
	    public void enterPswd()
	    {
	    	driver.findElementById("password").sendKeys("crmsfa");
	    }
	    @And("Click on the Login Button")
	    public void clickLogin()
	    {
	    	driver.findElementByClassName("decorativeSubmit").click();
	    }
	   
	    @And("Click on CRM/SFA.")
		public void clickCRMSFA()
		{
			driver.findElementByXPath("//img[@src='/opentaps_images/integratingweb/crm.png']").click();
		}
	    @And("Click on Lead Tab.")
	    public void clickLeadTab()
	    {
	    	driver.findElementByLinkText("Leads").click();
	    }
	    @And("Click on CreateLeadShortcut.")
	    public void clickcreateLeadLink()
	    {
	    	driver.findElementByLinkText("Create Lead").click();
	    	//driver.findElementById("ext-gen600").click();
	    }
	    @And("Enter Company Name(.*)")
	    public void enterCompanyName(String data)
	    {
	    	driver.findElementById("createLeadForm_companyName").sendKeys(data);
	    }
	    @And("Enter FirstName(.*)")
	    public void enterfname(String data)
	    {
	    	driver.findElementById("createLeadForm_firstName").sendKeys(data);	
	    }
	    @And("Enter LastName(.*)")
	    public void enterlname(String data) {
	    	driver.findElementById("createLeadForm_lastName").sendKeys(data);
	    }
	    @When("Click on Create Lead")
	    public void clickCreateLeadBtn()
	    {
	    	driver.findElementByXPath("//input[@class='smallSubmit']").click();
	    }
	    @Then("Verify Lead is Created")
	    public void verifyLeadCreate()
	    {
	    	System.out.println("Lead Created successfully");
	    }*/

}
