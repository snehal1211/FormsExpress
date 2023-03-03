package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEEndUserPaymentPageValidationPage;
import regressionsuite.FEStaffRequestCreationPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;

public class FEEndUserPaymentPageValidation {
	
	WebDriver driver;
    private FEEndUserPaymentPageValidationPage feEenduserpaymentpagevalidationpage = null;
	
	public FEEndUserPaymentPageValidation(TestInit ti) 
	{
		this.feEenduserpaymentpagevalidationpage = new FEEndUserPaymentPageValidationPage(ti);
	}
	
	@Given("^i am clicking on Notices and Payment tab$")
	public void i_am_clicking_on_Notices_and_Payment_tab() throws Throwable {
		feEenduserpaymentpagevalidationpage.clickOnNoticesandPaymentTab();
	}
	
	@Given("^clicking on pay button$")
	public void clicking_on_pay_button() throws Throwable {
		feEenduserpaymentpagevalidationpage.clickOnPayButton();
	}
	
	@Given("^Select the Recurring payment options and select payment method as credit card$")
	public void Select_the_Recurring_payment_options_and_select_payment_method_as_credit_card() throws Throwable {
		feEenduserpaymentpagevalidationpage.SelectTheRecurringPaymentOption();
	}
	
	@Given("^Provide the payment details and click on next button$")
	public void Provide_the_payment_details_and_click_on_next_button() throws Throwable {
		feEenduserpaymentpagevalidationpage.ProvideAllThePaymentDetails();
	}
	
	@Given("^Enter the captcha code and click on confirm button$")
	public void Enter_the_captcha_code_and_click_on_confirm_button() throws Throwable {
		feEenduserpaymentpagevalidationpage.ProvideTheCaptchaCode();
	}

}
