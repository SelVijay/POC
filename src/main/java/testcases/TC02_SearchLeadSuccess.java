package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_SearchLeadSuccess extends OpentapsWrappers{
		@BeforeClass
		public void startTestCase(){
			browserName 	= "firefox";
			dataSheetName 	= "TC02_SearchLeadSuccess";
			testCaseName 	= "TC02 - Search Lead (POM)";
			testDescription = "Searching Leads in OpenTaps using POM framework";
		}
		
		
		@Test(dataProvider="fetchData")
		public void searchLeadSuccess(String userName,String password,String loginName, 
					String fNameToFind, String lNameToFind, String coNameToFind) {
			new LoginPage()
			.enterUserName(userName)
			.enterPassword(password)
			.clickLogin()
//			.verifyLoggedinUserName(loginName)
			.clickCRMSFA()
			.clickOnLeadMenu()
			.clickingFindLeads()
			.enteringFirstName(fNameToFind)
			.enteringLastName(lNameToFind)
			.enteringCompanyName(coNameToFind)
			.clickFindLead()
			.clickSearchedLead();
//			.clickLogout();
		}
	}

