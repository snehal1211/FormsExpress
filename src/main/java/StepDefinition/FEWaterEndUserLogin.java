package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FELoginPage;
import regressionsuite.FEWaterEndUserLOgin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEWaterEndUserLogin {
	
	WebDriver driver;
    private FEWaterEndUserLOgin FEwaterenduserlogin = null;
	
	public FEWaterEndUserLogin(TestInit ti) 
	{
		this.FEwaterenduserlogin = new FEWaterEndUserLOgin(ti);
	}
	
	@Given("^I am in EndUser login page$")
	public void i_am_in_EndUser_login_page() throws Throwable {
		FEwaterenduserlogin.browserlaunching();
	}

	@When("^I input valid EndUser login credentials (.*) and (.*)")
	public void i_input_valid_EndUser_login_credentials_Endusername_and_Enduserpassword( String Endusername , String Enduserpassword) throws Throwable {
		FEwaterenduserlogin.inputCredentials(Endusername, Enduserpassword);
	}

	@When("^I click on EndUser Login button$")
	public void i_click_on_EndUser_Login_button() throws Throwable {
		FEwaterenduserlogin.clickonloginbutton();
	}

	@When("^EndUsername should be displayed in the homepage$")
	public void endusername_should_be_displayed_in_the_homepage() throws Throwable {
		FEwaterenduserlogin.homepageVerification();
	}

	@When("^Enduser should be able to logout to the application$")
	public void enduser_should_be_able_to_logout_to_the_application() throws Throwable {
		FEwaterenduserlogin.clickOnlogoutbutton();
	}

	
	 

}

