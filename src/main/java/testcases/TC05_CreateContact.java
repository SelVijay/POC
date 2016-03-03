package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC05_CreateContact extends OpentapsWrappers{
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC05_CreateContact";
		testCaseName 	= "TC05 - Create Contact (POM)";
		testDescription = "Creating Contact in OpenTaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createContactSuccess(String userName,String password,String loginName, String firstName, String lastName,
				String fNameToFind, String lNameToFind, String firstNameLocal) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		//.verifyLoggedinUserName(loginName)
		.clickCRMSFA()
		.clickingCreateContact()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmit();
//		.clickLogout();
	}
}
