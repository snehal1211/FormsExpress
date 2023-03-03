package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FEClientRequestCreationPage;
import regressionsuite.FEStaffJobCreationPage;
import regressionsuite.FEStaffRequestCreationPage;
import regressionsuite.FEjobPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEClientRequestCreation {
	
	WebDriver driver;
    private FEClientRequestCreationPage feclientRequestcreationpage = null;
	
	public FEClientRequestCreation(TestInit ti) 
	{
		this.feclientRequestcreationpage = new FEClientRequestCreationPage(ti);
	}
	
	@Given("^i am clicking on client Request button$")
	public void i_am_clicking_on_client_Request_button() throws Throwable {
		feclientRequestcreationpage.clickOnClientRequestTab();
	}

	@Given("^i am able to see the client Request fields$")
	public void i_am_able_to_see_the_client_Request_fields() throws Throwable {
		feclientRequestcreationpage.checkWhetherRequestCreationPageLoaded();
	}

	@Given("^i am clicking on creating new client Request tab$")
	public void i_am_clicking_on_creating_new_client_Request_tab() throws Throwable {
		feclientRequestcreationpage.clickOnAddNewRequestButton();
	}

	@Given("^i am providing all the client mandatory details and clicking on save button$")
	public void i_am_providing_all_the_client_mandatory_details_and_clicking_on_save_button() throws Throwable {
		feclientRequestcreationpage.ProvideAllRequestFields();
	}

	@Then("^Request should be created$")
	public void request_should_be_created() throws Throwable {
		feclientRequestcreationpage.REquestVerificationMessage();
	}

	 

}
