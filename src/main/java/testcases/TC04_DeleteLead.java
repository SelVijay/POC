package testcases;

import wrappers.OpentapsWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;


public class TC04_DeleteLead extends OpentapsWrappers{
			@BeforeClass
			public void startTestCase(){
				browserName 	= "firefox";
				dataSheetName 	= "TC04_DeleteLeadSuccess";
				testCaseName 	= "TC04 - Delete Lead (POM)";
				testDescription = "Searching and Deleting Leads in OpenTaps using POM framework";
			}
			
			
			@Test(dataProvider="fetchData")
			public void DeleteLeadSuccess(String userName,String password,String loginName, 
						String fNameToFind, String lNameToFind, String coNameToFind) {
				new LoginPage()
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				//.verifyLoggedinUserName(loginName)
				.clickCRMSFA()
				.clickOnLeadMenu()
				.clickingFindLeads()
				.enteringFirstName(fNameToFind)
				.enteringLastName(lNameToFind)
				.enteringCompanyName(coNameToFind)
				.clickFindLead()
				.clickSearchedLead()
				.clickDeleteButton()
				.clickingFindLeads()
			.enteringFirstName(fNameToFind)
			.enteringLastName(lNameToFind)
			.enteringCompanyName(coNameToFind)
			.clickFindLead()
			.getErrorMessage();
//				.clickLogout();
			}
		}
