package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FEStaffUserAccountsAdditionPage;
import regressionsuite.FEStaffJobCreationPage;
import regressionsuite.FEjobPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEStaffUserAccountsAddition {
	
	WebDriver driver;
    private FEStaffUserAccountsAdditionPage festaffaccountsadditionpage = null;
	
	public FEStaffUserAccountsAddition(TestInit ti) 
	{
		this.festaffaccountsadditionpage = new FEStaffUserAccountsAdditionPage(ti);
	}
	
	@Given("^I am clicking on Admin tab$")
	public void i_am_clicking_on_Admin_tab() throws Throwable {
		festaffaccountsadditionpage.StaffAdminTab();
	}

	@Given("^I am clicking on Users tab$")
	public void i_am_clicking_on_Users_tab() throws Throwable {
		festaffaccountsadditionpage.StaffUsersTab();
	}


	@Then("^i will search for the existing user$")
	public void i_will_search_for_the_existing_user() throws Throwable {
		festaffaccountsadditionpage.UserSearch();
	}

	@Then("^i will open the user profile and navigate to the account tab$")
	public void i_will_open_the_user_profile_and_navigate_to_the_account_tab() throws Throwable {
		festaffaccountsadditionpage.UserSelectionAndAccountsClick();
	}

	@Then("^i will pass reference number and add the account to users profile$")
	public void i_will_pass_reference_number_and_add_the_account_to_users_profile() throws Throwable {
		festaffaccountsadditionpage.ReferenceNumberAddition();
	}
	
	@Then("^i am clicking on Input Account Details link$")
	public void i_am_clicking_on_Input_Account_Details_link() throws Throwable {
		festaffaccountsadditionpage.UserClickInputAccoutDetailsLink();
	}
	
	@Then("^I will provide all the user account details$")
	public void I_will_provide_all_the_user_account_details() throws Throwable {
		festaffaccountsadditionpage.UserProvideAllTheUserAccountDetails();
	}
	 

}
