package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEClientUsersCreationPage;
import regressionsuite.FEStaffUsersCreationPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FEClientUsersCreation {
	WebDriver driver;
    private FEClientUsersCreationPage feclientuserscreationPage = null;
	
	public FEClientUsersCreation(TestInit ti) 
	{
		this.feclientuserscreationPage = new FEClientUsersCreationPage(ti);
	}
	
	
    @Given("^I am clicking on client side Users tab$")
	public void I_am_clicking_on_client_side_Users_tab() throws Throwable {
    	feclientuserscreationPage.StaffUsersTab();
	}

	@Given("^i am clicking on creating new client side User tab$")
	public void i_am_clicking_on_creating_new_client_side_User_tab () throws Throwable {
		feclientuserscreationPage.clickOnAddNewStaffUsersButton();
	}

	@Given("^i am providing all the client side mandatory details$")
	public void i_am_providing_all_the_client_side_mandatory_details() throws Throwable {
		feclientuserscreationPage.ProvideAllClientAddUsersMandatoryFields();
	}

	@Then("^clicking on client side save button$")
	public void clicking_on_client_side_save_button() throws Throwable {
		feclientuserscreationPage.ClickOnSaveButton();
	}
	
	@Then("^clicking on client side Back button$")
	public void clicking_on_client_side_back_button() throws Throwable {
		feclientuserscreationPage.ClickOnBackButton();
	}
	@Then("^success client side creation message should be displayed$")
	public void success_client_side_creation_message_should_be_displayed() throws Throwable {
		feclientuserscreationPage.VerificationClientAddMessage();
	}
	@Then("^i am providing all the end users mandatory details$")
	public void i_am_providing_all_the_end_users_mandatory_details() throws Throwable {
		feclientuserscreationPage.ProvideAllEndUsersMandatoryFields();
	}
	@Then("^success end users creation message should be displayed$")
	public void success_end_users_creation_message_should_be_displayed() throws Throwable {
		feclientuserscreationPage.VerificationEndUsersAddMessage();
	}
	@Then("^i am providing all the major agents mandatory details$")
	public void i_am_providing_all_the_major_agents_mandatory_details() throws Throwable {
		feclientuserscreationPage.ProvideAllMajorAgentsMandatoryFields();
	}
	@Then("^success major agents creation message should be displayed$")
	public void success_major_agents_creation_message_should_be_displayed() throws Throwable {
		feclientuserscreationPage.VerificationMajorAgentsAddMessage();
	}
	
	


}
