package regressionsuite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEClientAgentAccountsAdditionPage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	String ExtractedClientJOBID = "";
	
	
    public FEClientAgentAccountsAdditionPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    
  
    public void UserSearch() throws InterruptedException {
    	WebElement UsersSearchTextbox= driver.findElement(By.xpath(reference.UserSearchTextBox));
    	UsersSearchTextbox.clear();
    	String EmailId="automationaddaccount3@blazeclan.com";
    	Thread.sleep(5000);
    	UsersSearchTextbox.sendKeys(EmailId);
    	WebElement SearchButton= driver.findElement(By.xpath(reference.UsersSearchButton));
    	SearchButton.click();
    	Thread.sleep(5000);
    }
    
    public void UserSelectionAndAccountsClick() throws InterruptedException {
    	WebElement EmailSelection= driver.findElement(By.xpath(reference.AgentProfileOpeningButton));
    	EmailSelection.click();
    	Thread.sleep(8000);
    	WebElement AccountButn= driver.findElement(By.xpath(reference.StaffAccountsTab));
    	AccountButn.click();
    	
    	Thread.sleep(5000);
    }
    
    public void ReferenceNumberAddition() throws InterruptedException {
    	WebElement REferenceTextBox= driver.findElement(By.xpath(reference.ReferenceNumberTextBox));
    	REferenceTextBox.clear();
    	Thread.sleep(3000);
    	String ReferenceNumber="6D4CE04F3Z";
    	REferenceTextBox.sendKeys(ReferenceNumber);
    	WebElement REferenceButton= driver.findElement(By.xpath(reference.ReferenceNumberAddButton));
    	REferenceButton.click();
    	Thread.sleep(6000);
    	WebElement AccountAdditionButton= driver.findElement(By.xpath(reference.AccountAdditionSuccessButton));
    	AccountAdditionButton.click();
    	Thread.sleep(6000);
    	WebElement AddedReferenceVerification= driver.findElement(By.xpath(reference.AccountVerificationSearchTextBox));
        AddedReferenceVerification.clear();
        Thread.sleep(3000);
        String AccountNumber="1916352";
        AddedReferenceVerification.sendKeys(AccountNumber);
    	Thread.sleep(9000);
    //String AcntHolderName="Forms Express 5";
   // WebElement ExtractAccountHolderName= driver.findElement(By.xpath(reference.AccountHolderName));
    
    	//  String ActualAccountHolderName= ExtractAccountHolderName.getText();
		//  Assert.assertEquals(AcntHolderName, ActualAccountHolderName);	
		 // Thread.sleep(8000);
    	
    }
    
    public void UserProvideAllTheUserAccountDetails() throws InterruptedException {
    	WebElement UsersEnterAccountNumber= driver.findElement(By.xpath(reference.UserAddAccountNumberTextBox));
    	String AccouNumber="100005";
    	UsersEnterAccountNumber.sendKeys(AccouNumber);
    	Thread.sleep(3000);
    	
    	WebElement UsersEnterAccountName= driver.findElement(By.xpath(reference.UserAddAccountNameTextBox));
    	String AccouName="Forms Express 6";
    	UsersEnterAccountName.sendKeys(AccouName);
    	Thread.sleep(3000);
    	
    	//WebElement AccountCategory= driver.findElement(By.xpath(reference.UserselectAccountCategoryDropdown));
    	//String Accountcate="Rates";
    	//Select AccountCategory = new Select(driver.findElement(By.xpath(reference.UserselectAccountCategoryDropdown)));
    	//AccountCategory.sendKeys(Accountcate);
		//Thread.sleep(2000);
    	
    	WebElement AccountCategory= driver.findElement(By.xpath(reference.UserselectAccountCategoryDropdown));
    	AccountCategory.click();
    	Thread.sleep(2000);
    	WebElement AccountCategoryRates= driver.findElement(By.xpath(reference.UserselectAccountCategoryRates));
    	AccountCategoryRates.click();
    	AccountCategory.click();
    	
    	Thread.sleep(2000);
    	
		WebElement ClickOnUserAddButton = driver.findElement(By.xpath(reference.AccountAdditionAddButton));
		ClickOnUserAddButton.click();
		Thread.sleep(8000);
		
		WebElement AddedReferenceVerification= driver.findElement(By.xpath(reference.AccountVerificationSearchTextBox));
    	AddedReferenceVerification.clear();
    	Thread.sleep(2000);
    	String AccountNumber="100005";
    	AddedReferenceVerification.sendKeys(AccountNumber);
    	Thread.sleep(8000);
		
		WebElement logoutButton= driver.findElement(By.xpath(reference.LogoutButton));
		logoutButton.click();
		Thread.sleep(3000);
		driver.close();
    }
    
    
    
    

}
