package StepDefinition;

import org.openqa.selenium.WebDriver;

import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import regressionsuite.FEWaterEndUserProfileUpatePage;
import regressionsuite.MajorAgentDownloadNoticesPage;

public class MajorAgentDownloadNotices {
	WebDriver driver;
    private MajorAgentDownloadNoticesPage majoragentdownloadnoticespage = null;
	
	public MajorAgentDownloadNotices(TestInit ti) 
	{
		this.majoragentdownloadnoticespage = new MajorAgentDownloadNoticesPage(ti);
	}
	@Given("^I am clicking on Notices and Payment link$")
	public void i_am_clicking_on_Notices_and_Payment_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		majoragentdownloadnoticespage.AgentNoticeAndPaymentLink();
	}

	@When("^I am clicking on Download Notices\\(s\\) button$")
	public void i_am_clicking_on_Download_Notices_s_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		majoragentdownloadnoticespage.AgentNoticesSelectAllCheckboxes();
	}

	@Then("^To verify Notices Downloaded or not$")
	public void to_verify_Notices_Downloaded_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		majoragentdownloadnoticespage.AgentToVerifyDownloadNotices();
	}
	

}
