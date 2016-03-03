package testcases;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import pages.LoginPage;
	import wrappers.OpentapsWrappers;

	public class TC01_CreateLeadFailure extends OpentapsWrappers{
		@BeforeClass
		public void startTestCase(){
			browserName 	= "firefox";
			dataSheetName 	= "TC02_CreateLeadFail";
			testCaseName 	= "TC01 - Create Lead (POM)";
			testDescription = "Creating Leads in OpenTaps using POM framework";
		}
		
		
		@Test(dataProvider="fetchData")
		public void createLeadSuccess(String userName,String password,String loginName, String companyName,String firstName, String lastName) {
//			new CreateLeadPage()
			new LoginPage()
			.enterUserName(userName)
			.enterPassword(password)
			.clickLogin()
			//.verifyLoggedinUserName(loginName)
			.clickCRMSFA()
			.clickingCreateLead()
			.enterCompanyName(companyName)
			.enterFirstName(firstName)
			.enterLastName(lastName)
			.clickCreateForFailure()
		//	.testingCreatedLead(firstName, companyName, lastName)
			.getErrorMessage();
//			.clickLogout();
		}
	}
	//div[@class='messages']/div
