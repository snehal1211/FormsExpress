package StepDefinition;

import org.openqa.selenium.WebDriver;

import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import regressionsuite.FEStaffClickOnUserPage;
import regressionsuite.FEStaffRequestCreationPage;

public class FEStaffClickOnUser {
	WebDriver driver;
    private FEStaffClickOnUserPage festaffclickonuserpage = null;
	
	public FEStaffClickOnUser(TestInit ti) 
	{
		this.festaffclickonuserpage = new FEStaffClickOnUserPage(ti);
	}
	
	@Given("^i am clicking on Admin button$")
	public void i_am_clicking_on_Admin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		festaffclickonuserpage.clickOnAdminTab();
	}

	@Then("^i am clicking on user page$")
	public void i_am_clicking_on_user_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		festaffclickonuserpage.clickOnUserTab();
	}
	
}
