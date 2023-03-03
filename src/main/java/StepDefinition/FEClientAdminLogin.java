package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FEClientAdminLoginpage;
import regressionsuite.FELoginPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEClientAdminLogin {
	
	WebDriver driver;
    private FEClientAdminLoginpage feclientadminloginpage = null;
	
	public FEClientAdminLogin(TestInit ti) 
	{
		this.feclientadminloginpage = new FEClientAdminLoginpage(ti);
	}
	
	
	@Given("^I am in ClientAdmin login page$")
	public void i_am_in_ClientAdmin_login_page() throws Throwable {
		feclientadminloginpage.browserlaunching();
	}

	@When("^I input client valid log in credentials (.*) and (.*)")
	public void i_input_client_valid_log_in_credentials_Clientusername_and_clientpassword(String clientusername, String clientpassword) throws Throwable {
		feclientadminloginpage.inputCredentials(clientusername, clientpassword);
	}

	@When("^I click on log me in button$")
	public void i_click_on_log_me_in_button() throws Throwable {
		feclientadminloginpage.clickonloginbutton();
	}

	@When("^Username should be displayed in the client homepage$")
	public void username_should_be_displayed_in_the_client_homepage() throws Throwable {
		feclientadminloginpage.displaymethod();
	   
	}
	
	@When("^user should be able to logout to the client application$")
	public void user_should_be_able_to_logout_to_the_client_application() throws Throwable {
		feclientadminloginpage.clickonClientlogOutbutton();
	}


}

