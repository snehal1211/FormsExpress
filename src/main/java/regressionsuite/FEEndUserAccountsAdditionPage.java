package regressionsuite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEEndUserAccountsAdditionPage extends DriverManager {
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
	
    public FEEndUserAccountsAdditionPage(TestInit ti) 
	{
		this.ti = ti; 
		
	}
    
    public void UserAddYourNoticeLink() throws InterruptedException {
    	WebElement UserAddNoticesLink= driver.findElement(By.xpath(reference.UserAddNoticeLink));
    	UserAddNoticesLink.click();
    	Thread.sleep(5000);
    }
    
    public void EndUserReferenceNumberAddition() throws InterruptedException {
    	WebElement EndUserREferenceTextBox= driver.findElement(By.xpath(reference.UserAddAccountTextBox));
    	EndUserREferenceTextBox.clear();
    	Thread.sleep(2000);
    	String ReferenceNumber="260344313Z";
    	EndUserREferenceTextBox.sendKeys(ReferenceNumber);
    	WebElement EndUserREferenceButton= driver.findElement(By.xpath(reference.UserAddNoticeLinkButton));
    	EndUserREferenceButton.click();
    	Thread.sleep(5000);
    	WebElement UserAccountAdditionYesButton= driver.findElement(By.xpath(reference.UserAccountAdditionSuccessButton));
    	UserAccountAdditionYesButton.click();
    	Thread.sleep(6000);
    	WebElement EndUserAddedReferenceVerification= driver.findElement(By.xpath(reference.UserAccountVerificationSearchTextBox));
    	EndUserAddedReferenceVerification.clear();
    	Thread.sleep(2000);
    	String AccountNumber="100027";
    	EndUserAddedReferenceVerification.sendKeys(AccountNumber);
    	Thread.sleep(3000);
    String UserAcntHolderName="Forms Express 28";
    WebElement UserExtractAccountHolderName= driver.findElement(By.xpath(reference.UserAccountHolderName));
    
    
		
		  String ActualAccountHolderName= UserExtractAccountHolderName.getText();
		  Assert.assertEquals(UserAcntHolderName, ActualAccountHolderName);
		  Thread.sleep(8000);
		  WebElement FeWaterLogoutBtn = driver.findElement(By.xpath(reference.EndUserLogout));
		   FeWaterLogoutBtn.click();
		   Thread.sleep(3000);
		   driver.close();
    	
    }
   

	
}
