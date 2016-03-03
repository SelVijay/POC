package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{

	public HomePage() {

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			Reporter.reportStep("This is NOT Home page", "FAIL");
		}

	}
	// Verify the username
	public HomePage verifyLoggedinUserName(String userName){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), userName);
		return this;
	}
	public LogoutPage clickLogout(){
		clickByLink(prop.getProperty("LogoutPage.Logout.Link"));
		return new LogoutPage();
	}

	public MyHomePage clickCRMSFA()
	{
		clickByLink(prop.getProperty("Login.ClickCrmsfa.LinkText"));
		return new MyHomePage();
		}
}
