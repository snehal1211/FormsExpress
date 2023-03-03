package StepDefinition;

import org.openqa.selenium.WebDriver;

import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import regressionsuite.FEEndUserAccountsAdditionPage;

@SuppressWarnings("deprecation")
public class FEEndUserAccountsAddition {
	WebDriver driver;
    private FEEndUserAccountsAdditionPage feenduseraccountsadditionpage = null;
	
	public FEEndUserAccountsAddition(TestInit ti) 
	{
		this.feenduseraccountsadditionpage = new FEEndUserAccountsAdditionPage(ti);
	}
	
	@Given("^I am clicking on Add your notice link$")
	public void i_am_clicking_on_Add_your_notice_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		feenduseraccountsadditionpage.UserAddYourNoticeLink();
	}

	@Then("^i will pass reference number and add the account to end users profile$")
	public void i_will_pass_reference_number_and_add_the_account_to_end_users_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		feenduseraccountsadditionpage.EndUserReferenceNumberAddition();
	}

		
	

}
