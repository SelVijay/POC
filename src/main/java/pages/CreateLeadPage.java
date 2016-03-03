
package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers {
	
	public CreateLeadPage()
	{
		if(!verifyTitle("Create Lead | opentaps CRM"))
		{
			Reporter.reportStep("This is NOT Create Lead page", "FAIL");
		}
	}

	public CreateLeadPage enterCompanyName(String userdata){
		enterById(prop.getProperty("CreateLead.CompanyName.Id"), userdata);
		return this;
	}
	
	
	public CreateLeadPage enterFirstName(String userdata){
		enterById(prop.getProperty("CreateLead.FirstName.Id"), userdata);
		return this;
	}
	public CreateLeadPage enterLastName(String userdata){
		enterById(prop.getProperty("CreateLead.LastName.Id"), userdata);
		return this;
	}
	
	public ViewLeadPage clickSubmit(){
		clickByName(prop.getProperty("CreateLead.CreateButton.Name"));
		return new ViewLeadPage();
	}



	// Click Login
	public CreateLeadPage clickCreateForFailure(){
		clickByName(prop.getProperty("CreateLead.CreateButton.Name"));
		return this;
	}


	public CreateLeadPage getErrorMessage(){
		System.out.println(getTextByXpath("//div[@class='messages']/div"));
		System.out.println(getTextByXpath("//div[@class='messages']/ul/li"));
		return this;
	}




}
