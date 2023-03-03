package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEClientAgentAccountsAdditionPage;
import regressionsuite.FEClientUserAccountsAdditionPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FEClientAgentAccountsAddition {
	WebDriver driver;
	
    private FEClientAgentAccountsAdditionPage feclientagentaccountsadditionpage = null;
	
	public FEClientAgentAccountsAddition(TestInit ti) 
	{
		this.feclientagentaccountsadditionpage = new FEClientAgentAccountsAdditionPage(ti);
	}

	@Then("^i will search for the existing major agent as client admin$")
	public void i_will_search_for_the_existing_major_agent_as_client_admin() throws Throwable {
		feclientagentaccountsadditionpage.UserSearch();
	}

	@Then("^i will open the major agent profile and navigate to the account tab page$")
	public void i_will_open_the_major_agent_profile_and_navigate_to_the_account_tab_page() throws Throwable {
		feclientagentaccountsadditionpage.UserSelectionAndAccountsClick();
	}

	@Then("^i will pass reference number and add the account to major agent profile page$")
	public void i_will_pass_reference_number_and_add_the_account_to_major_agent_profile_page() throws Throwable {
		feclientagentaccountsadditionpage.ReferenceNumberAddition();
	}
	
	@Then("^I will provide all the major agent account details for the account addition$")
	public void I_will_provide_all_the_major_agent_account_details_for_the_account_addition() throws Throwable {
		feclientagentaccountsadditionpage.UserProvideAllTheUserAccountDetails();
	}
	 

}
