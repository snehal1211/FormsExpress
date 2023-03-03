package regressionsuite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FESubmissionTypeReportPage extends DriverManager {
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FESubmissionTypeReportPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    
    public void JobSearch() throws InterruptedException {
    	WebElement JobsSearchTextbox= driver.findElement(By.xpath(reference.JobSearchTextBox));
    	JobsSearchTextbox.clear();
    	String JobId = "202011230004";
    	Thread.sleep(5000);
    	JobsSearchTextbox.sendKeys(JobId);
    	Thread.sleep(5000);
    }
    
    public void JobSelection() throws InterruptedException {
    	WebElement JobSelection= driver.findElement(By.xpath(reference.JobOpeningButton));
    	JobSelection.click();
    	Thread.sleep(9000);
    }
    
    public void SelectionReportTabAndSelectionOfReports() throws InterruptedException {
    	
    	WebElement ReportTabSelection= driver.findElement(By.xpath(reference.StaffReportsTab));
    	ReportTabSelection.click();
    	Thread.sleep(5000);
    	
		Select select = new Select(driver.findElement(By.xpath(reference.StaffSubmissionReportDropdown)));
		select.selectByVisibleText("BPAY Delivery Report");
		Thread.sleep(10000);
		
		select.selectByVisibleText("Delivery Method Report");
		Thread.sleep(10000);
		
		select.selectByVisibleText("Email Delivery Report");
		Thread.sleep(10000);
		
		select.selectByVisibleText("Email Open Report");
		Thread.sleep(10000);
		
		select.selectByVisibleText("Email Report");
		Thread.sleep(10000);
		
		select.selectByVisibleText("Reference Number Report");
		Thread.sleep(10000);
		
		WebElement logoutButton= driver.findElement(By.xpath(reference.LogoutButton));
		logoutButton.click();
		Thread.sleep(3000);
		driver.close();
			
	}
    

}
