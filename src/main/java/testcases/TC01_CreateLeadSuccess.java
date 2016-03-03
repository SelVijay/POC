package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC01_CreateLeadSuccess extends OpentapsWrappers{
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC02_CreateLead";
		testCaseName 	= "TC01 - Create Lead (POM)";
		testDescription = "Creating Leads in OpenTaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLeadSuccess(String userName,String password,String loginName, String companyName,String firstName, String lastName) {		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
//		.verifyLoggedinUserName(loginName)
		.clickCRMSFA()
		.clickingCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmit();
//		.clickLogout()
	}
}
