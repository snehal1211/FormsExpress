package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEClientSystemReportsPage extends DriverManager{

	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
	public FEClientSystemReportsPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
  
    public void ClientSystemReportTab() throws InterruptedException {
    	WebElement StaffSysReportTab= driver.findElement(By.xpath(reference.SystemReportTabButton));
    	StaffSysReportTab.click();
    	Thread.sleep(4000);
    }
    public void ClientSelectAllTheReports() throws InterruptedException {
    	
		Select select = new Select(driver.findElement(By.xpath(reference.ClientSystemReportsDropdown)));
		select.selectByVisibleText("All Active Users in System");
		Thread.sleep(2000);
		WebElement ClickOnRunButton= driver.findElement(By.xpath(reference.ClientRunButton));
		ClickOnRunButton.click();
		Thread.sleep(10000);
		
		select.selectByVisibleText("All Non-Active Users in System");
		ClickOnRunButton.click();
		Thread.sleep(10000);
		
		select.selectByVisibleText("Active BPAY Users Report");
		ClickOnRunButton.click();
		Thread.sleep(10000);
		
		select.selectByVisibleText("Deactivated BPAY users report");
		ClickOnRunButton.click();
		Thread.sleep(10000);
		
		select.selectByVisibleText("Failed BPay users report");
		ClickOnRunButton.click();
		Thread.sleep(20000);
		
		select.selectByVisibleText("Active Email Customers Report");
		ClickOnRunButton.click();
		Thread.sleep(10000);
		
		select.selectByVisibleText("Duplicate Registered Account Report");
		ClickOnRunButton.click();
		Thread.sleep(8000);
		
		WebElement logoutButton= driver.findElement(By.xpath(reference.LogoutButton));
		logoutButton.click();
		Thread.sleep(3000);
		driver.close();
    }

}
