package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEClientUserAccountsAdditionPage;
import regressionsuite.FEStaffUserAccountsAdditionPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FEClientUserAccountsAddition {

	
	WebDriver driver;
    private FEClientUserAccountsAdditionPage feCclientuseraccountsadditionpage = null;
	
	public FEClientUserAccountsAddition(TestInit ti) 
	{
		this.feCclientuseraccountsadditionpage = new FEClientUserAccountsAdditionPage(ti);
	}
	
	
	@Given("^I am clicking on Users tab menu$")
	public void i_am_clicking_on_Users_tab_menu() throws Throwable {
		feCclientuseraccountsadditionpage.StaffUsersTab();
	}


	@Then("^i will search for the existing users$")
	public void i_will_search_for_the_existing_users() throws Throwable {
		feCclientuseraccountsadditionpage.UserSearch();
	}

	@Then("^i will open the user profile and navigate to the account tab page$")
	public void i_will_open_the_user_profile_and_navigate_to_the_account_tab_page() throws Throwable {
		feCclientuseraccountsadditionpage.UserSelectionAndAccountsClick();
	}

	@Then("^i will pass reference number and add the account to users profile page$")
	public void i_will_pass_reference_number_and_add_the_account_to_users_profile_page() throws Throwable {
		feCclientuseraccountsadditionpage.ReferenceNumberAddition();
	}
	
	@Then("^i am clicking on the Input Account Details link$")
	public void i_am_clicking_on_the_Input_Account_Details_link() throws Throwable {
		feCclientuseraccountsadditionpage.UserClickInputAccoutDetailsLink();
	}
	
	@Then("^I will provide all the user account details for the account addition$")
	public void I_will_provide_all_the_user_account_details_for_the_account_addition() throws Throwable {
		feCclientuseraccountsadditionpage.UserProvideAllTheUserAccountDetails();
	}
	 
}
