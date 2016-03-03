package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyContactsPage extends  OpentapsWrappers {
	
	public MyContactsPage() {
		if(!verifyTitle("My Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT My Leads page", "FAIL");
		}
	}
	
	public SearchContactPage clickOnFindContacts() {
		clickByLink(prop.getProperty("MyContactsPage.FindContact.link")); // Find Contacts
		return new SearchContactPage();
	}
	
}
