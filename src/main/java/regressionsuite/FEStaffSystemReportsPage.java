package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEStaffSystemReportsPage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
	public FEStaffSystemReportsPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    public void StaffAdminTab() throws InterruptedException {
    	WebElement StaffAdmnTab= driver.findElement(By.xpath(reference.Admintab));
    	StaffAdmnTab.click();
    	Thread.sleep(5000);
    }
    
    public void StaffSystemReportTab() throws InterruptedException {
    	WebElement StaffSysReportTab= driver.findElement(By.xpath(reference.SystemReportTabButton));
    	StaffSysReportTab.click();
    	Thread.sleep(4000);
    }
    public void StaffSelectAllTheReports() throws InterruptedException {
    	
    	WebElement SelectAdvanceSearch = driver.findElement(By.xpath(reference.AdvancedSearchTab));
    	SelectAdvanceSearch.click();
    	Thread.sleep(1000);
    	
    	WebElement SelectOrganisation = driver.findElement(By.xpath(reference.SelectOrganisation));
    	SelectOrganisation.click();
    	Thread.sleep(2000);
    	
    	WebElement SearchOrganisation = driver.findElement(By.xpath(reference.SearchOrganisation));
    	String SearchOrgani ="fe water";
    	SearchOrganisation.sendKeys(SearchOrgani);
    	Thread.sleep(2000);
    	
    	WebElement ClickOrganisation = driver.findElement(By.xpath(reference.ClickOrganisation));
    	ClickOrganisation.click();
    	Thread.sleep(2000);
    	
    	WebElement ClickOnApplyButton = driver.findElement(By.xpath(reference.ApplyButton));
    	ClickOnApplyButton.click();
    	Thread.sleep(2000);
    	
    	WebElement SelectAllActiveReport = driver.findElement(By.xpath(reference.SelectAllActiveReport));
    	SelectAllActiveReport.click();
    	Thread.sleep(8000);
    	WebElement StaffSysReportTab= driver.findElement(By.xpath(reference.SystemReportTabButton));
    	StaffSysReportTab.click();
    	Thread.sleep(5000);
    	
    	WebElement SelectAllNonActiveReport = driver.findElement(By.xpath(reference.SelectAllNonActiveReport));
    	SelectAllNonActiveReport.click();
    	Thread.sleep(8000);
    	
    	WebElement SelectActiveBpayReport = driver.findElement(By.xpath(reference.SelectActiveBpayReport));
    	SelectActiveBpayReport.click();
    	Thread.sleep(8000);
    	
    	WebElement SelectDeactivatedBpayReport = driver.findElement(By.xpath(reference.SelectDeactivatedBpayReport));
    	SelectDeactivatedBpayReport.click();
    	Thread.sleep(8000);
    	
    	WebElement SelectFailedBpayReport = driver.findElement(By.xpath(reference.SelectFailedBpayReport));
    	SelectFailedBpayReport.click();
    	Thread.sleep(8000);
    	
    	WebElement SelectActiveEmailCustomerReport = driver.findElement(By.xpath(reference.SelectActiveEmailCustomersReport));
    	SelectActiveEmailCustomerReport.click();
    	Thread.sleep(8000);
    	
    	WebElement SelectDuplicateRegisteredReport = driver.findElement(By.xpath(reference.SelectDuplicateRegisteredAccountReport));
    	SelectDuplicateRegisteredReport.click();
    	Thread.sleep(8000);
    	
    	WebElement StaffLogoutLink= driver.findElement(By.xpath(reference.LogoutButton));
		StaffLogoutLink.click();
		Thread.sleep(3000);
		driver.close();
    }

}
