package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers {

	
	public EditLeadPage()
	{
		if((!verifyTitle("opentaps CRM"))&&(verifyTextById(prop.getProperty("EditLead.SectionHeader.Id"), "Edit Lead")))
				{
			Reporter.reportStep("Unable to Navigate To Edit Page", "FAIL");
				}
	}
	
	public EditLeadPage updatingFirstNameLocal(String fNameLocal)
	{
		enterById(prop.getProperty("EditLead.FirstNameLocal.Id"), fNameLocal);
		return this;
	}
	
	public ViewLeadPage submitEditButton()
	{
		clickByXpath(prop.getProperty("EditLead.SubmitLead.XPath"));
		return new ViewLeadPage();
	}


}
