package StepDefinition;

import org.openqa.selenium.WebDriver;

import regressionsuite.FEClientSystemReportsPage;
import regressionsuite.FEStaffSystemReportsPage;
import BDDframework.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FEClientSystemReports {
	
	WebDriver driver;
    private FEClientSystemReportsPage feclientsystemreportsPage = null;
	
	public FEClientSystemReports(TestInit ti) 
	{
		this.feclientsystemreportsPage = new FEClientSystemReportsPage(ti);
	}
	
	@Then("^I am clicking on client sytem reports tab$")
	public void I_am_clicking_on_client_sytem_reports_tab() throws Throwable {
		feclientsystemreportsPage.ClientSystemReportTab();
	}

	@Then("^select all the reports$")
	public void select_all_the_reports() throws Throwable {
		feclientsystemreportsPage.ClientSelectAllTheReports();
	}

	

}
