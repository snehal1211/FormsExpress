package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FELoginPage;
import regressionsuite.FEWaterEndUserSignUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEWaterEndUserSignUp {
	
	WebDriver driver;
    private FEWaterEndUserSignUpPage fewaterendusersignuppage = null;
	
	public FEWaterEndUserSignUp(TestInit ti) 
	{
		this.fewaterendusersignuppage = new FEWaterEndUserSignUpPage(ti);
	}
	
	
	@Given("^End User will click on signup Button$")
	public void end_User_will_click_on_signup_Button() throws Throwable {
		fewaterendusersignuppage.ClickOnSignUPButton();
	}

	@When("^I input valid email is and ReferenceNumber (.*) and (.*)")
	public void i_input_valid_email_is_and_ReferenceNumber_EmailId_and_ReferenceNumber(String EmailId, String ReferenceNumber) throws Throwable {
		fewaterendusersignuppage.inputCredentials(EmailId, ReferenceNumber);
	}

	@When("^will click on Submit Button$")
	public void will_click_on_Submit_Button() throws Throwable {
		fewaterendusersignuppage.SIgnUpConfirmationButton();
	}

	@When("^Successful Confirmation Message should be displayed$")
	public void successful_Confirmation_Message_should_be_displayed() throws Throwable {
		fewaterendusersignuppage.confirmationMessage();
	}
	@Then("^Broswer should be Closed$")
	public void user_should_be_able_to_logout_to_the_application() throws Throwable {
		fewaterendusersignuppage.closeBrowser();
	}

	  
	 

}

