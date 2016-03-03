package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC06_FindContacts extends OpentapsWrappers {

	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC06_FindContact";
		testCaseName 	= "TC06 - FindContacts (POM)";
		testDescription = "Login to Opentaps and Find the Contacts using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void findContactsTestCases(String username,String password, String loginName, String FirstName, String Lastname) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
//		.verifyLoggedinUserName(loginName)
		.clickCRMSFA()
		.clickOnContactMenu()
		.clickOnFindContacts()
//		.enterContactId(ContactID)
		.enterContactFirstName(FirstName)
		.enterContactLastName(Lastname)
		.clickFindContactsButton()
		.selectFoundContact()
		.verifyFirstName(FirstName)
		.verifyLastName(Lastname);
	
}
}
