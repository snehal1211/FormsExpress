package StepDefinition;

import org.openqa.selenium.WebDriver;

import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import regressionsuite.FEWaterAgentLoginPage;
import regressionsuite.FEWaterEndUserLOgin;

@SuppressWarnings("deprecation")
public class FEWaterAgentLogin {
	
	WebDriver driver;
    private FEWaterAgentLoginPage fewateragentloginpage = null;
	
	public FEWaterAgentLogin(TestInit ti) 
	{
		this.fewateragentloginpage = new FEWaterAgentLoginPage(ti);
	}
	@Given("^I am in MajorAgent login page$")
	public void i_am_in_MajorAgent_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fewateragentloginpage.browserlaunching();
	}

	@When("^I input valid MajorAgent login credentials (.*) and (.*)")
	public void i_input_valid_MajorAgent_login_credentials_Agentusername_and_Agentuserpassword(String Agentusername , String Agentuserpassword) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fewateragentloginpage.inputCredentialss(Agentusername, Agentuserpassword);
	}

	@When("^I click on MajorAgent Login button$")
	public void i_click_on_MajorAgent_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fewateragentloginpage.clickonloginbuttons();
	}

	@When("^AgentUsername should be displayed in the homepage$")
	public void agentusername_should_be_displayed_in_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fewateragentloginpage.homepageVerifications();
	}

	@When("^Agentuser should be able to logout to the application$")
	public void agentuser_should_be_able_to_logout_to_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fewateragentloginpage.clickOnlogoutbuttons();
	}


}
