package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class MajorAgentDownloadNoticesPage extends DriverManager{
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	String ExtractedClientJOBID = "";
	
	
    public MajorAgentDownloadNoticesPage(TestInit ti) 
	{
		this.ti = ti; 
	}
    public void AgentNoticeAndPaymentLink() throws InterruptedException {
    	WebElement NoticesAndPaymentLink= driver.findElement(By.xpath(reference.AgentNoticesandPaymentLink));
    	NoticesAndPaymentLink.click();
    	Thread.sleep(4000);
    }
    
    public void AgentNoticesSelectAllCheckboxes() throws InterruptedException {
    	WebElement NoticesSelectAllCheckboxes= driver.findElement(By.xpath(reference.AgentSelectAllNoticesCheckbox));
    	NoticesSelectAllCheckboxes.click();
    	Thread.sleep(5000);
    }
    public void AgentToVerifyDownloadNotices() throws InterruptedException {
    	WebElement VerifyDownloadNotices= driver.findElement(By.xpath(reference.AgentDownloadNoticesButton));
    	VerifyDownloadNotices.click();
    	Thread.sleep(5000);
    }
    

}
