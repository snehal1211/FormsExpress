package StepDefinition;

import org.openqa.selenium.WebDriver;
import regressionsuite.FESubmissionTypeReportPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FESubmissionTypeReport {
	
	WebDriver driver;
    private FESubmissionTypeReportPage fesubmissiontypereportpage = null;
	
	public FESubmissionTypeReport(TestInit ti) 
	{
		this.fesubmissiontypereportpage = new FESubmissionTypeReportPage(ti);
	}
	
	@Given("^i will search for the existing job$")
	public void i_will_search_for_the_existing_job() throws Throwable {
		fesubmissiontypereportpage.JobSearch();
	}

	@Given("^i will open the Job and navigate to the job deatils page$")
	public void i_will_open_the_Job_and_navigate_to_the_job_deatils_page() throws Throwable {
		fesubmissiontypereportpage.JobSelection();
	}


	@Then("^i am clicking on reports tab and select the report$")
	public void i_am_clicking_on_reports_tab_and_select_the_report() throws Throwable {
		fesubmissiontypereportpage.SelectionReportTabAndSelectionOfReports();
	}
	
}
