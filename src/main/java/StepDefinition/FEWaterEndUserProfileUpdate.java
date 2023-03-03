package StepDefinition;

import org.openqa.selenium.WebDriver;

import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import regressionsuite.FEStaffUserAccountsAdditionPage;
import regressionsuite.FEWaterEndUserProfileUpatePage;

@SuppressWarnings("deprecation")
public class FEWaterEndUserProfileUpdate {
	
	WebDriver driver;
    private FEWaterEndUserProfileUpatePage fewaterenduserprofileupatepage = null;
	
	public FEWaterEndUserProfileUpdate(TestInit ti) 
	{
		this.fewaterenduserprofileupatepage = new FEWaterEndUserProfileUpatePage(ti);
	}
	
	@Given("^I am clicking on View Details link$")
	public void i_am_clicking_on_View_Details_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fewaterenduserprofileupatepage.UserViewDetailsLink();
		
	}

	@Then("^i will pass user details and click on save button$")
	public void i_will_pass_user_details_and_click_on_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fewaterenduserprofileupatepage.UserProfileUpdateDetails();
		
	}
	

}
