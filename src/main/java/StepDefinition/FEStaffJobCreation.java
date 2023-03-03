package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FEStaffJobCreationPage;
import regressionsuite.FEjobPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEStaffJobCreation {
	
	WebDriver driver;
    private FEStaffJobCreationPage festaffjobcreationpage = null;
	
	public FEStaffJobCreation(TestInit ti) 
	{
		this.festaffjobcreationpage = new FEStaffJobCreationPage(ti);
	}
	
	@Given("^i am clicking on creating new job tab$")
	public void i_am_clicking_on_creating_new_job_tab() throws Throwable {
		
		festaffjobcreationpage.clickOnAddNewJobButton();
	    
	}

	@Given("^i am able to see the job fields$")
	public void i_am_able_to_see_the_job_fields() throws Throwable {
		festaffjobcreationpage.checkWhetherJObCreationPageLoaded();
	    
	}

	@Given("^i am providing all the mandatory details in job page$")
	public void i_am_providing_all_the_mandatory_details_in_job_page() throws Throwable {
		festaffjobcreationpage.ProvideAllJobFields();
	}
	
	/*@Given("^click on Data tab and select the upload file$")
	public void click_on_Data_tab_and_select_the_upload_file() throws Throwable {
	   
		festaffjobcreationpage.SelectDataDetails();
	}*/

	@Given("^click on contact tab and select the contact details$")
	public void click_on_contact_tab_and_select_the_contact_details() throws Throwable {
		festaffjobcreationpage.SelectContactDetails();
	    
	}

	@Given("^click on Additional details Tab and provide the details$")
	public void click_on_Additional_details_Tab_and_provide_the_details() throws Throwable {
		festaffjobcreationpage.AdditionalInstructionFeild();
	    
	}

	@Then("^success job message should be displayed$")
	public void success_job_message_should_be_displayed() throws Throwable {
		festaffjobcreationpage.VerificationMessage();
	    
	}
	
	
	  
	 

}
