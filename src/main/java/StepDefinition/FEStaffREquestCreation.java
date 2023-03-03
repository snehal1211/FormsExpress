package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FEStaffJobCreationPage;
import regressionsuite.FEStaffRequestCreationPage;
import regressionsuite.FEjobPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEStaffREquestCreation {
	
	WebDriver driver;
    private FEStaffRequestCreationPage festaffRequestcreationpage = null;
	
	public FEStaffREquestCreation(TestInit ti) 
	{
		this.festaffRequestcreationpage = new FEStaffRequestCreationPage(ti);
	}
	
	@Given("^i am clicking on Request button$")
	public void i_am_clicking_on_Request_button() throws Throwable {
		festaffRequestcreationpage.clickOnRequestTab();
	}
	
	@Given("^i am able to see the Request fields$")
	public void i_am_able_to_see_the_Request_fields() throws Throwable {
		festaffRequestcreationpage.checkWhetherRequestCreationPageLoaded();
	}
	@Given("^i am clicking on creating new Request tab$")
	public void i_am_clicking_on_creating_new_Request_tab() throws Throwable {
		festaffRequestcreationpage.clickOnAddNewRequestButton();
	}

	

	@Given("^i am providing all the mandatory details and clicking on save button$")
	public void i_am_providing_all_the_mandatory_details_and_clicking_on_save_button() throws Throwable {
		festaffRequestcreationpage.ProvideAllRequestFields();
	}

	@Then("^success message should be displayed$")
	public void success_message_should_be_displayed() throws Throwable {
		festaffRequestcreationpage.REquestVerificationMessage();
	}

	
	
	  
	 

}
