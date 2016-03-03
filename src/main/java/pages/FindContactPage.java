package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindContactPage extends OpentapsWrappers {
	
	public FindContactPage()
	{
		if(!verifyTitle("Find Contacts | opentaps CRM"))
		{
			Reporter.reportStep("This is NOT Create Lead Home page", "FAIL");
		}
	}
	public FindContactPage enteringFirstName(String fNameToFind)
	{
		enterByXPath(prop.getProperty("FindContact.fName.XPath"), fNameToFind);
		return this;
		
	}
	public FindContactPage enteringLastName(String lNameToFind)
	{
		enterByXPath(prop.getProperty("FindContact.lName.XPath"), lNameToFind);
		return this;
		
	}	
	
	public FindContactPage clickFindContact()
	{
		clickByXpath(prop.getProperty("FindContact.Button.XPath"));
		return this;
	}
	
	public ViewContactPage clickSearchedContact()
	{
		clickByXpath(prop.getProperty("FindContact.clickFoundObj.Xpath"));
		return new ViewContactPage();
	}
	
	
	
}
