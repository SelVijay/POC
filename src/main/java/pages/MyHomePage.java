package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyHomePage extends OpentapsWrappers{


	public MyHomePage() {
	
		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT Create Lead Home page", "FAIL");
		}

	}
	
	public CreateLeadPage clickingCreateLead() {
		clickByLink(prop.getProperty("MyHomePage.CreateLead.LinkText"));
		return new CreateLeadPage();
		}

	
	public CreateContactPage clickingCreateContact() {
		clickByLink(prop.getProperty("MyHomePage.CreateContact.LinkText"));
		return new CreateContactPage();
		}
	
	public MyLeadsPage clickOnLeadMenu() {
		clickByLink(prop.getProperty("MyHomePage.LeadMenu.Link")); // "Leads"
		return new MyLeadsPage(); 
	}
	
	public MyContactsPage clickOnContactMenu() {
		clickByLink(prop.getProperty("MyHomePage.ContactMenu.Link")); // "Contacts"
		return new MyContactsPage(); 
	}
}
