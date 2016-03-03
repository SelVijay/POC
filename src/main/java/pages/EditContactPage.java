package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditContactPage extends OpentapsWrappers {
	
	public  EditContactPage()
	{
		if(!verifyTitle("opentaps CRM"))
		{
			Reporter.reportStep("Contact is not Editable","FAIL");
		}
	}
	
	public EditContactPage enterEditFirstName(String EditFirstname){
		enterByXPath(prop.getProperty("EditContactPage.EditFirstName.XPath"), EditFirstname);
		return this;
	}
	
	public EditContactPage enterEditLastName(String EditLastname){
		enterByXPath(prop.getProperty("EditContactPage.EditLastName.XPath"), EditLastname);
		return this;
	}

	public ViewContactPage clickUpdateContact(){
		clickByName(prop.getProperty("EditContactPage.UpdateContact.Name"));
		return new ViewContactPage();
	}
}
