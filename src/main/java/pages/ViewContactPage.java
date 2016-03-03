package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewContactPage extends OpentapsWrappers {

	public  ViewContactPage()
	{
		if(!verifyTitle("View Contact | opentaps CRM"))
		{
			Reporter.reportStep("Contact page is not displayed","FAIL");
		}
	}
	
	public EditContactPage clickOnEditLink() {
		clickByLink(prop.getProperty("ViewContactPage.Edit.Link")); // "Edit"
		return new EditContactPage(); 
	}

	public ViewContactPage verifyFirstName(String VerifyFName) {
		verifyTextById(prop.getProperty("ViewContactPage.VerifyFirstName.Id"),VerifyFName);
		return this; 
	}
	
	public ViewContactPage verifyLastName(String verifyLName) {
		verifyTextById(prop.getProperty("ViewContactPage.VerifyLastName.Id"),verifyLName);
		return this; 
	}

	public ViewContactPage clickOnDeactivate() {
		clickByLink(prop.getProperty("ViewContactPage.DeactivateContact.Link")); // "Deactivate Contact"
		waitForSeconds(5);
		acceptAlert();
		return this;
	}
	
	public ViewContactPage acceptAlertOk() {
		acceptAlert();
		return this;
	}
	
	public MyContactsPage deleteConfirmation() {
		getTextByClassName(prop.getProperty("ViewContactPage.DeactivateWarning.Class")); // subSectionWarning
		return new MyContactsPage();
	}
	
	
	
	
	
}
