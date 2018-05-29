package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Pooja";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String cName,String fname,String lname) {
		try
		{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.ClickCreateLeadLink()
		.typeCompanyName(cName)
		.typeFirstName(fname)
		.typeLastName(lname)
		.ClickCreateLeadButton()
		.verifyFirstName(fname)
		.ClickLogout();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
