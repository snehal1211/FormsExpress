package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FEClientJobCreationPage;
import regressionsuite.FEStaffJobCreationPage;
import regressionsuite.FEjobPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEClientJobCreation {
	
	WebDriver driver;
    private FEClientJobCreationPage feclientjobcreationpage = null;
	
	public FEClientJobCreation(TestInit ti) 
	{
		this.feclientjobcreationpage = new FEClientJobCreationPage(ti);
	}
	
	@Given("^i am clicking on client job button$")
	public void i_am_clicking_on_client_job_button() throws Throwable {
		feclientjobcreationpage.ClientJoBTabClick();
	}

	@Given("^i am able to see the client job fields$")
	public void i_am_able_to_see_the_client_job_fields() throws Throwable {
		feclientjobcreationpage.checkWhetherClientJObCreationPageLoaded();
	}

	@Given("^i am clicking on creating new client job tab$")
	public void i_am_clicking_on_creating_new_client_job_tab() throws Throwable {
		feclientjobcreationpage.clickOnAddNewClientJobButton();
	}

	@Given("^i am selecting notice type and clicking on next button$")
	public void i_am_selecting_notice_type_and_clicking_on_next_button() throws Throwable {
		feclientjobcreationpage.ProvideClientNoticeType();
	}

	@Given("^i am providing the additional details and clicking on next button$")
	public void i_am_providing_the_additional_details_and_clicking_on_next_button() throws Throwable {
		feclientjobcreationpage.ProvideClientAdditionalDetails();
	}

	@Given("^i am submitting the job as a client user$")
	public void i_am_submitting_the_job_as_a_client_user() throws Throwable {
		feclientjobcreationpage.ClientJobSubmission();
	}

	@Then("^successfully job should be created$")
	public void successfully_job_should_be_created() throws Throwable {
		feclientjobcreationpage.ClientSuccessfullyJobCreationMessage();
	}

	  
	 

}

