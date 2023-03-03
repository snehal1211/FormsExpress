package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEStaffSystemReportsPage;
import regressionsuite.FEStaffUsersCreationPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FESystemTypeReport {
	
	WebDriver driver;
    private FEStaffSystemReportsPage festaffsystemreportspage = null;
	
	public FESystemTypeReport(TestInit ti) 
	{
		this.festaffsystemreportspage = new FEStaffSystemReportsPage(ti);
	}
	
	@Given("^I am clicking on staff1 Admin tab$")
	public void I_am_clicking_on_staff1_Admin_tab() throws Throwable {
		festaffsystemreportspage.StaffAdminTab();
	}

	@Then("^I am clicking on sytem reports tab$")
	public void I_am_clicking_on_sytem_reports_tab() throws Throwable {
		festaffsystemreportspage.StaffSystemReportTab();
	}

	@Then("^Select the organisation and select all the reports$")
	public void Select_the_organisation_and_select_all_the_reports() throws Throwable {
		festaffsystemreportspage.StaffSelectAllTheReports();
	}

	
}
