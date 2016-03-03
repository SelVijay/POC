package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC07_EditContacts extends OpentapsWrappers {


	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC07_EditContact";
		testCaseName 	= "TC07 - EditContacts (POM)";
		testDescription = "Login to Opentaps and Edit the Contacts using POM framework";
	}

	@Test(dataProvider="fetchData")
	public void editContactsTestCases(String username,String password, String loginName, String FirstName, String Lastname, String EditFirstname, String EditLastname) {
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
		.clickOnEditLink()
		.enterEditFirstName(EditFirstname)
		.enterEditLastName(EditLastname)
		.clickUpdateContact()
		.verifyFirstName(EditFirstname)
		.verifyLastName(EditLastname);

	}
}