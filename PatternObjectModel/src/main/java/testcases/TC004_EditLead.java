package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
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
		.ClickFindLeadLink()
		.typecname(cName)
		.typefname(fname)
		.typelname(lname)
		.clickFindLead()
		.clickOnLink()
		.clickEditLead()
		.updatecname()
		.clickUpdateBtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
