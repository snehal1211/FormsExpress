package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FELoginPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FELoginStepdefination {
	
	WebDriver driver;
    private FELoginPage feloginpage = null;
	
	public FELoginStepdefination(TestInit ti) 
	{
		this.feloginpage = new FELoginPage(ti);
	}
	
	
	@Given("^I am in log in page$")
	public void i_am_in_log_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		feloginpage.browserlaunching();

	}
	
	@When("^I input valid log in credentials (.*) and (.*)")
	public void i_input_valid_log_in_credentials_staffusername_and_staffpassword(String staffusername, String staffpassword) throws Throwable {
	   
		feloginpage.inputCredentials(staffusername, staffpassword);

	}

	/*
	 * @When("^I input valid log in credentials, (.*) , (.*)") public void
	 * i_input_valid_log_in_credentials_staffusername_and_staffpassword(String
	 * staffusername, String staffpassword) throws Throwable {
	 * feloginpage.inputCredentials(staffusername, staffpassword);
	 * 
	 * 
	 * }
	 */

	@When("^I click log me in button$")
	public void i_click_log_me_in_button() throws Throwable {
	    feloginpage.clickonloginbutton();
	    
	}
	
	@When("^Username should be displayed in the homepage$")
	public void username_should_be_displayed_in_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean test=feloginpage.displaymethod();
		System.out.println(test);
	}
	
	@When("^user should be able to logout to the application$")
	public void user_should_be_able_to_logout_to_the_application() throws Throwable {
		feloginpage.clickonlogOutbutton();
	}

	
	  
	 

}
