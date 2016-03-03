package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;


public class TC02_SearchLeadFailure extends OpentapsWrappers{
			@BeforeClass
			public void startTestCase(){
				browserName 	= "firefox";
				dataSheetName 	= "TC02_SearchLeadFailure";
				testCaseName 	= "TC02 - Search Lead (POM)";
				testDescription = "Searching Leads For Failure Scenario in OpenTaps using POM framework";
			}
			
			
			@Test(dataProvider="fetchData")
			public void searchLeadSuccess(String userName,String password,String loginName, 
						String fNameToFind, String lNameToFind, String coNameToFind) {
//				new CreateLeadPage()
				new LoginPage()
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				//.verifyLoggedinUserName(loginName)
				.clickCRMSFA()
				.clickOnLeadMenu()
				.clickingFindLeads()
//					.clickingFindLeads()
				.enteringFirstName(fNameToFind)
				.enteringLastName(lNameToFind)
				.enteringCompanyName(coNameToFind)
				.clickFindLead()
//				.clickSearchedLead();
				.getErrorMessage();
			//	.clickEditButton()
//				.updatingFirstNameLocal(firstNameLocal)
//				.clickEditButton()
				//	.testingCreatedLead(firstName, companyName, lastName)
//				.clickLogout();
//				.clickLogout();
			}
		}