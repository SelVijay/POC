package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers{
	
	public FindLeadPage()
	{
		if(!verifyTitle("Find Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Create Lead Home page", "FAIL");
		}
	}

	public FindLeadPage enteringFirstName(String fNameToFind)
	{
		enterByXPath(prop.getProperty("FindLead.fName.XPath"), fNameToFind);
		return this;
		
	}
	public FindLeadPage enteringLastName(String lNameToFind)
	{
		enterByXPath(prop.getProperty("FindLead.lName.XPath"), lNameToFind);
		return this;
		
	}	public FindLeadPage enteringCompanyName(String coNameToFind)
	{
		enterByXPath(prop.getProperty("FindLead.coName.XPath"), coNameToFind);
		return this;
		
	}
	
	public FindLeadPage clickFindLead()
	{
		clickByXpath(prop.getProperty("FindLead.Button.XPath"));
		return this;
	}
	
	public ViewLeadPage clickSearchedLead()
	{
		clickByXpath(prop.getProperty("FindLead.clickFoundObj.Xpath"));
		return new ViewLeadPage();
	}
	
	/*public FindLeadPage clickSearchForFailure(){
		clickByName(prop.getProperty("FindLead.Button.XPath"));
		return this;
	}*/
	
	public FindLeadPage getErrorMessage(){
		System.out.println(prop.getProperty("FindLead.ErrorMsg.Class"));
//		System.out.println(getTextByXpath("//div[@class='messages']/ul/li"));
		return this;
	}


	
	
	
	
}
