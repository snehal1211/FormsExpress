package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEClientJobCreationPage;
import regressionsuite.FEStaffUsersCreationPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FEStaffUsersCreation {

	WebDriver driver;
    private FEStaffUsersCreationPage festaffuserscreationpage = null;
	
	public FEStaffUsersCreation(TestInit ti) 
	{
		this.festaffuserscreationpage = new FEStaffUsersCreationPage(ti);
	}
	
	@Given("^I am clicking on staff Admin tab$")
	public void i_am_clicking_on_staff_Admin_tab() throws Throwable {
		festaffuserscreationpage.StaffAdminTab();
	}

	@Given("^I am clicking on staff Users tab$")
	public void i_am_clicking_on_staff_Users_tab() throws Throwable {
		festaffuserscreationpage.StaffUsersTab();
	}

	@Given("^i am clicking on creating new User tab$")
	public void i_am_clicking_on_creating_new_User_tab () throws Throwable {
		festaffuserscreationpage.clickOnAddNewStaffUsersButton();
	}

	@Given("^i am providing all the user mandatory details$")
	public void i_am_providing_all_the_user_mandatory_details() throws Throwable {
		festaffuserscreationpage.ProvideAllStaffUsersMandatoryFields();
	}

	@Then("^clicking on save button$")
	public void clicking_on_save_button() throws Throwable {
		festaffuserscreationpage.ClickOnSaveButton();
	}
	
	@Then("^clicking on Back button$")
	public void clicking_on_back_button() throws Throwable {
		festaffuserscreationpage.ClickOnBackButton();
	}
	@Then("^success user creation message should be displayed$")
	public void success_job_message_should_be_displayed() throws Throwable {
		festaffuserscreationpage.VerificationstaffMessage();
	}
	@Then("^i am providing all the client admin mandatory details$")
	public void i_am_providing_all_the_client_admin_mandatory_details() throws Throwable {
		festaffuserscreationpage.ProvideAllClientAdminMandatoryFields();
	}
	@Then("^success client creation creation message should be displayed$")
	public void success_client_creation_creation_message_should_be_displayed () throws Throwable {
		festaffuserscreationpage.VerificationClientAdminMessage();
	}
	@Then("^i am providing all the end user mandatory details$")
	public void i_am_providing_all_the_end_user_mandatory_details() throws Throwable {
		festaffuserscreationpage.ProvideAllEndUserMandatoryFields();
	}
	@Then("^success end user creation message should be displayed$")
	public void success_end_user_creation_message_should_be_displayed() throws Throwable {
		festaffuserscreationpage.VerificationEndUserMessage();
	}
	@Then("^i am providing all the major agent mandatory details$")
	public void i_am_providing_all_the_major_agent_mandatory_details() throws Throwable {
		festaffuserscreationpage.ProvideAllMajorAgentMandatoryFields();
	}
	@Then("^success major agent creation message should be displayed$")
	public void success_major_agent_creation_message_should_be_displayed() throws Throwable {
		festaffuserscreationpage.VerificationMajorAgentMessage();
	}

	

	  
	 

}


