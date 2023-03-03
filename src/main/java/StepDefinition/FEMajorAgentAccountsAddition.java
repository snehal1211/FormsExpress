package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEEndUserAccountsAdditionPage;
import regressionsuite.FEMajorAgentAccountsAdditionPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FEMajorAgentAccountsAddition {
	WebDriver driver;
    private FEMajorAgentAccountsAdditionPage femajoragentaccountsadditionpage = null;
	
	public FEMajorAgentAccountsAddition(TestInit ti) 
	{
		this.femajoragentaccountsadditionpage = new FEMajorAgentAccountsAdditionPage(ti);
	}
	
	//@Given("^I am clicking on Add your notice link$")
	//public void i_am_clicking_on_Add_your_notice_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//femajoragentaccountsadditionpage.UserAddYourNoticeLink();
	//}

	@Then("^i will pass reference number and add the account to major agent profiles$")
	public void i_will_pass_reference_number_and_add_the_account_to_major_agent_profiles() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		femajoragentaccountsadditionpage.MajorAgentReferenceNumberAddition();
	}

		
}
