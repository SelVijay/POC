package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class SearchContactPage extends OpentapsWrappers {
	
	public SearchContactPage() {
		if(!verifyTitle("Find Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT My Leads page", "FAIL");
		}
	}
	
	public SearchContactPage enterContactId(String userdata){
		enterByXPath(prop.getProperty("SearchContactPage.contactId.Xpath"), userdata);
		return this;
	}
	
	public SearchContactPage enterContactFirstName(String userdata){
		enterByXPath(prop.getProperty("SearchContactPage.firstname.Xpath"), userdata);
		return this;
	}
	
	public SearchContactPage enterContactLastName(String userdata){
		enterByXPath(prop.getProperty("SearchContactPage.lastname.Xpath"), userdata);
		return this;
	}
		
	public SearchContactPage clickFindContactsButton(){
		clickByXpath(prop.getProperty("SearchContactPage.FindContactBtn.Xpath")); //button[@class='x-btn-text' and contains(text(), 'Find Contacts')]
		return this;
	}
	
	public ViewContactPage selectFoundContact(){
		clickByXpath(prop.getProperty("SearchContactPage.SelectFindContact.Xpath")); // //table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a
		waitForSeconds(3000);
		return new ViewContactPage();
	}

	public SearchContactPage getErrorMessage(){
		System.out.println(prop.getProperty("SearchContactPage.ErrorMsg.Class"));
		return this;
	}
}
