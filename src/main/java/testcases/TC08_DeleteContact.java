package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC08_DeleteContact extends OpentapsWrappers {


	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC08_DeleteContact";
		testCaseName 	= "TC08 - DeleteContact (POM)";
		testDescription = "Login to Opentaps and Delete the Contacts using POM framework";
	}

	@Test(dataProvider="fetchData")
	public void editContactsTestCases(String username,String password, String loginName, String FirstName, String Lastname) {
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
		.clickOnDeactivate()
//		.acceptAlertOk()
		.deleteConfirmation()
		.clickOnFindContacts()
		.enterContactFirstName(FirstName)
		.enterContactLastName(Lastname)
		.clickFindContactsButton()
		.getErrorMessage();

	}
}