package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public  ViewLeadPage()
	{
		if(!verifyTitle("View Lead | opentaps CRM"))
		{
			Reporter.reportStep("Lead is not Created","FAIL");
		}
	}
	
		
	public ViewLeadPage verifyingCreateLead(String companyName,String firstName, String lastName)
	{
		if(
		(verifyTextById(prop.getProperty("ViewLead.ValidateCoName.Id"), companyName))&&
		(verifyTextById(prop.getProperty("ViewLead.ValidatefName.Id"), firstName))&&
		(verifyTextById(prop.getProperty("ViewLead.ValidateslName.Id"), lastName)))
			{
			Reporter.reportStep("Lead has been Created Successfully", "PASS");
			}
		else
		{
			{
				Reporter.reportStep("Lead Creation is not Successfully", "FAIL");
				}
		}
		return this;
	}
	
	
		public FindLeadPage clickingFindLeads()
		{
			clickByLink(prop.getProperty("FindLead.clickLead.LinkText"));
			return new FindLeadPage();
		}
		
		public EditLeadPage clickEditButton()
		{
			clickByLink(prop.getProperty("ViewLead.Edit.Link"));
			return new EditLeadPage();
			
		}
		
		public MyLeadsPage clickDeleteButton()
		{
			clickByLink(prop.getProperty("ViewLead.Delete.Link"));
			return new MyLeadsPage();
			
		}
		public LogoutPage clickLogout(){
			clickByLink(prop.getProperty("LogoutPage.Logout.Link"));
			return new LogoutPage();
		}
		
	}
	
