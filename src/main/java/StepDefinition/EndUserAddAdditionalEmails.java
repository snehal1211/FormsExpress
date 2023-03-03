package StepDefinition;

import org.openqa.selenium.WebDriver;

import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import regressionsuite.EndUserAddAdditionalEmailsPage;
import regressionsuite.FEEndUserAccountsAdditionPage;

@SuppressWarnings("deprecation")
public class EndUserAddAdditionalEmails {
	
	WebDriver driver;
    private EndUserAddAdditionalEmailsPage enduseraddadditionalemailspage = null;
	
	public EndUserAddAdditionalEmails(TestInit ti) 
	{
		this.enduseraddadditionalemailspage = new EndUserAddAdditionalEmailsPage(ti);
	}
	
	@Given("^I am clicking on Add your notice link for additional email add$")
	public void i_am_clicking_on_Add_your_notice_link_for_additional_email_add() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		enduseraddadditionalemailspage.UserAddYourNoticeLink();
	}

	@When("^I click on Emails tab$")
	public void i_click_on_Emails_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		enduseraddadditionalemailspage.UserClickOnEmailsTab();
	}

	@Then("^i will pass email and add the email to end users profile$")
	public void i_will_pass_email_and_add_the_email_to_end_users_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		enduseraddadditionalemailspage.EndUserAddAdditionalEmails();
	}



}
