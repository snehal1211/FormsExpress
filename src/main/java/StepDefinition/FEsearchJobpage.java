package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import regressionsuite.FEjobPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BDDframework.utils.TestInit;

@SuppressWarnings("deprecation")
public class FEsearchJobpage {
	
	WebDriver driver;
    private FEjobPage fejobpage = null;
	
	public FEsearchJobpage(TestInit ti) 
	{
		this.fejobpage = new FEjobPage(ti);
	}
	
	
	@Given("^i am clicking on job tab on the homepage$")
	public void i_am_clicking_on_job_tab_on_the_homepage() throws Throwable {
	    fejobpage.clickOnJobButton();
	}

	@Given("^i verifying the All jobs tab$")
	public void i_verifying_the_All_jobs_tab() throws Throwable {
	    boolean dummy=fejobpage.checkAllJobsTab();
	    System.out.println(dummy);
	}
	
	  
	 

}