
package testcases;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import pages.LoginPage;
	import wrappers.OpentapsWrappers;

public class TC03_EditLeadSuccess  extends OpentapsWrappers{
			@BeforeClass
			public void startTestCase(){
				browserName 	= "firefox";
				dataSheetName 	= "TC02_EditLeadSuccess";
				testCaseName 	= "TC02 - Edit Lead (POM)";
				testDescription = "Searching and Editiing Leads in OpenTaps using POM framework";
			}
			
			
			@Test(dataProvider="fetchData")
			public void editLeadSuccess(String userName,String password,String loginName, String Id, 
						String fNameToFind, String lNameToFind, String coNameToFind, String firstNameLocal) {
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
				.clickEditButton()
				.updatingFirstNameLocal(firstNameLocal)
				.submitEditButton();
//				.clickLogout();
			}
		}