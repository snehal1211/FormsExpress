package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEStaffMAAccountsAdditionPage;
import regressionsuite.FEStaffUserAccountsAdditionPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FEStaffMAAccountsAddition {
	WebDriver driver;
    private FEStaffMAAccountsAdditionPage festaffmaaccountsadditionpage = null;
    
	
	public FEStaffMAAccountsAddition(TestInit ti) 
	{
		this.festaffmaaccountsadditionpage = new FEStaffMAAccountsAdditionPage(ti);
	}
	


	@Then("^i will search for the existing major agent$")
	public void i_will_search_for_the_existing_major_agent() throws Throwable {
		festaffmaaccountsadditionpage.UserSearch();
	}

	@Then("^i will open the major agent profile and navigate to the account tab$")
	public void i_will_open_the_major_agent_profile_and_navigate_to_the_account_tab() throws Throwable {
		festaffmaaccountsadditionpage.UserSelectionAndAccountsClick();
	}

	@Then("^i will pass reference number and add the account to major agent profile$")
	public void i_will_pass_reference_number_and_add_the_account_to_major_agent_profile() throws Throwable {
		festaffmaaccountsadditionpage.ReferenceNumberAddition();
	}
	
	@Then("^i am clicking on Input Account Details link for the major agent$")
	public void i_am_clicking_on_Input_Account_Details_link_for_the_major_agent() throws Throwable {
		festaffmaaccountsadditionpage.UserClickInputAccoutDetailsLink();
	}
	
	@Then("^I will provide all the major agent account details$")
	public void I_will_provide_all_the_major_agent_account_details() throws Throwable {
		festaffmaaccountsadditionpage.UserProvideAllTheUserAccountDetails();
	}
	 


}
