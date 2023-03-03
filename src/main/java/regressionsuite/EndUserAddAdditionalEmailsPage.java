package regressionsuite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class EndUserAddAdditionalEmailsPage extends DriverManager {
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public EndUserAddAdditionalEmailsPage(TestInit ti) 
	{
		this.ti = ti; 
		
	}
    public void UserAddYourNoticeLink() throws InterruptedException {
    	WebElement UserAddNoticesLink= driver.findElement(By.xpath(reference.UserAddNoticeLink));
    	UserAddNoticesLink.click();
    	Thread.sleep(5000);
    }
    
    public void UserClickOnEmailsTab() throws InterruptedException {
    	WebElement UserAddAdditonalEmails= driver.findElement(By.xpath(reference.UserEmailsTab));
    	UserAddAdditonalEmails.click();
    	Thread.sleep(5000);
    }
    public void EndUserAddAdditionalEmails() throws InterruptedException {
    	WebElement EndUserAdditinalEmailsTextBox= driver.findElement(By.xpath(reference.UseradditionaleNoticesemailTextBox));
    	EndUserAdditinalEmailsTextBox.clear();
    	Thread.sleep(2000);
    	String EmailId="as@gmail.com";
    	EndUserAdditinalEmailsTextBox.sendKeys(EmailId);
    	WebElement EndUserEmailAddButton= driver.findElement(By.xpath(reference.UserAddadditionalemailAddButton));
    	EndUserEmailAddButton.click();
    	Thread.sleep(5000);
    	
    	
    String UserAcntHolderName="as@gmail.com";
    WebElement UserExtractAdditionalEmailName= driver.findElement(By.xpath(reference.UserAdditionalEmailName));
    
		
		  String ActualAccountHolderName= UserExtractAdditionalEmailName.getText();
		  Assert.assertEquals(UserAcntHolderName, ActualAccountHolderName);
		 		
    }
    

}
