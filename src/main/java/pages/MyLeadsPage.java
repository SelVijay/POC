package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {

	public MyLeadsPage ()
	{
		if(!verifyTitle("My Leads | opentaps CRM"))
		{
			Reporter.reportStep("Not able to navigate to the Leads Page", "FAIL");
		}
	}
	
	public FindLeadPage clickingFindLeads()
	{
		clickByLink(prop.getProperty("FindLead.clickLead.LinkText"));
		return new FindLeadPage();
	}
	

}
