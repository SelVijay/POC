package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateContactPage extends OpentapsWrappers {

	public CreateContactPage()
	{
		if(!verifyTitle("Create Contact | opentaps CRM"))
		{
			Reporter.reportStep("This is NOT Create Lead page", "FAIL");
		}
	}
//TC03_CreateContact
	
	public CreateContactPage enterFirstName(String userdata){
		enterByXPath(prop.getProperty("CreateContact.FirstName.XPath"), userdata);
		return this;
	}
	public CreateContactPage enterLastName(String userdata){
		enterByXPath(prop.getProperty("CreateContact.LastName.XPath"), userdata);
		return this;
	}
	
	public ViewContactPage clickSubmit(){
		clickByClassName(prop.getProperty("CreateContact.SubmitContact.Class"));
		return new ViewContactPage();
	}





}
