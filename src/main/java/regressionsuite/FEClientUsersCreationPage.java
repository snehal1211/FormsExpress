package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEClientUsersCreationPage extends DriverManager {
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
	public FEClientUsersCreationPage(TestInit ti) 
	{
		this.ti = ti; 			
	}
    
    public void StaffUsersTab() throws InterruptedException {
    	WebElement StaffUserTab= driver.findElement(By.xpath(reference.UsersTab));
    	StaffUserTab.click();
    	Thread.sleep(5000);
    }
    
    public void clickOnAddNewStaffUsersButton() throws InterruptedException {
    	WebElement AddnewStaffUser= driver.findElement(By.xpath(reference.StaffAddUsersButton));
    	AddnewStaffUser.click();
		Thread.sleep(3000);
    }
    
    public void ProvideAllClientAddUsersMandatoryFields() throws InterruptedException {
    	System.out.println("Firstname");
    	
    	Select UserType = new Select(driver.findElement(By.xpath(reference.StaffUserTypeDropDown)));
    	UserType.selectByVisibleText("Client Admin");
		Thread.sleep(5000);
		
    	WebElement StaffFirstName = driver.findElement(By.xpath(reference.StaffFirstNameTextBox));
    	String StaffFistName ="Clienttestfirst";
    	StaffFirstName.sendKeys(StaffFistName);
    	Thread.sleep(2000);
    	
    	WebElement StaffLastName = driver.findElement(By.xpath(reference.StaffLastNameTextBox));
    	String StafflstName ="Clienttestlast";
    	StaffLastName.sendKeys(StafflstName);
    	Thread.sleep(2000);
    	
    	WebElement StaffEmailAddress = driver.findElement(By.xpath(reference.StaffEmailAddressTextBox));
    	String StaffEmAddress ="clientadmincreation3@blazeclan.com";
    	StaffEmailAddress.sendKeys(StaffEmAddress);
    	Thread.sleep(2000);
    	
    	WebElement StaffUsername = driver.findElement(By.xpath(reference.StaffUsernameTextBox));
    	String StaffUsenm ="client admin456";
    	StaffUsername.sendKeys(StaffUsenm);
    	Thread.sleep(2000);
    	
    	WebElement StaffPassword = driver.findElement(By.xpath(reference.StaffPasswordTextBox));
    	String StaffPasd ="Test@1234";
    	StaffPassword.sendKeys(StaffPasd);
    	Thread.sleep(2000);
    	
    	WebElement StaffConfirmPassword = driver.findElement(By.xpath(reference.StaffConfirmPasswordTextBox));
    	String StaffConfirmPasrd ="Test@1234";
    	StaffConfirmPassword.sendKeys(StaffConfirmPasrd);
    	Thread.sleep(5000);
    	
    	
    }

    
public void ClickOnSaveButton() throws InterruptedException {
		
		WebElement ClickOnUserSaveButton = driver.findElement(By.xpath(reference.StaffSaveButton));
		ClickOnUserSaveButton.click();
		Thread.sleep(4000);
		
		
		}	
public void ClickOnBackButton() throws InterruptedException {
        
	   Thread.sleep(2000);
        WebElement ClickOnUserbackButton = driver.findElement(By.xpath(reference.StaffUserBackButton));
        ClickOnUserbackButton.click();
        Thread.sleep(5000);
}
public void VerificationClientAddMessage() throws InterruptedException
{
	//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
	String StaffEmAddress="clientadmincreation3@blazeclan.com";
	Thread.sleep(2000);
	WebElement StaffUserSearchText = driver.findElement(By.xpath(reference.StaffSearchBox));
	StaffUserSearchText.clear();
	Thread.sleep(2000);
	StaffUserSearchText.sendKeys(StaffEmAddress);
	Thread.sleep(2000);
	WebElement StaffClickSearch= driver.findElement(By.xpath(reference.StaffClickSearchButton));
	StaffClickSearch.click();
	Thread.sleep(9000);
		
}
public void ProvideAllEndUsersMandatoryFields() throws InterruptedException {
	
	Select UserType = new Select(driver.findElement(By.xpath(reference.StaffUserTypeDropDown)));
	UserType.selectByVisibleText("User");
	Thread.sleep(5000);
	
	WebElement StaffEmailAddress = driver.findElement(By.xpath(reference.StaffEmailAddressTextBox));
	String StaffEmAddress ="Enduserscreation@blazeclan.com";
	StaffEmailAddress.sendKeys(StaffEmAddress);
	Thread.sleep(2000);
	
	WebElement StaffPassword = driver.findElement(By.xpath(reference.StaffPasswordTextBox));
	String StaffPasd ="Test@1234";
	StaffPassword.sendKeys(StaffPasd);
	Thread.sleep(2000);
	
	WebElement StaffConfirmPassword = driver.findElement(By.xpath(reference.StaffConfirmPasswordTextBox));
	String StaffConfirmPasrd ="Test@1234";
	StaffConfirmPassword.sendKeys(StaffConfirmPasrd);
	Thread.sleep(5000);
	
}
public void VerificationEndUsersAddMessage() throws InterruptedException
{
	//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
	String StaffEmAddress="Enduserscreation@blazeclan.com";
	Thread.sleep(2000);
	WebElement StaffUserSearchText = driver.findElement(By.xpath(reference.StaffSearchBox));
	StaffUserSearchText.clear();
	Thread.sleep(2000);
	StaffUserSearchText.sendKeys(StaffEmAddress);
	Thread.sleep(2000);
	WebElement StaffClickSearch= driver.findElement(By.xpath(reference.StaffClickSearchButton));
	StaffClickSearch.click();
	Thread.sleep(9000);
		
}
public void ProvideAllMajorAgentsMandatoryFields() throws InterruptedException {
	
	Select UserType = new Select(driver.findElement(By.xpath(reference.StaffUserTypeDropDown)));
	UserType.selectByVisibleText("Agent");
	Thread.sleep(5000);
	
	WebElement StaffFirstName = driver.findElement(By.xpath(reference.StaffFirstNameTextBox));
	String StaffFistName ="Agenttestfirst";
	StaffFirstName.sendKeys(StaffFistName);
	Thread.sleep(2000);
	
	WebElement StaffEmailAddress = driver.findElement(By.xpath(reference.StaffEmailAddressTextBox));
	String StaffEmAddress ="MajorAgentscreation@blazeclan.com";
	StaffEmailAddress.sendKeys(StaffEmAddress);
	Thread.sleep(2000);
	
	WebElement StaffPassword = driver.findElement(By.xpath(reference.StaffPasswordTextBox));
	String StaffPasd ="Test@1234";
	StaffPassword.sendKeys(StaffPasd);
	Thread.sleep(2000);
	
	WebElement StaffConfirmPassword = driver.findElement(By.xpath(reference.StaffConfirmPasswordTextBox));
	String StaffConfirmPasrd ="Test@1234";
	StaffConfirmPassword.sendKeys(StaffConfirmPasrd);
	Thread.sleep(2000);
	
	WebElement StaffAgentCode = driver.findElement(By.xpath(reference.AgentCodeTextBox));
	String StaffAgeCode ="FTY5u";
	StaffAgentCode.sendKeys(StaffAgeCode);
	Thread.sleep(5000);
	
}
public void VerificationMajorAgentsAddMessage() throws InterruptedException
{
	//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
	String StaffEmAddress="MajorAgentscreation@blazeclan.com";
	Thread.sleep(2000);
	WebElement StaffUserSearchText = driver.findElement(By.xpath(reference.StaffSearchBox));
	StaffUserSearchText.clear();
	Thread.sleep(2000);
	StaffUserSearchText.sendKeys(StaffEmAddress);
	Thread.sleep(2000);
	WebElement StaffClickSearch= driver.findElement(By.xpath(reference.StaffClickSearchButton));
	StaffClickSearch.click();
	Thread.sleep(8000);
	
	WebElement StaffLogoutLink= driver.findElement(By.xpath(reference.LogoutButton));
	StaffLogoutLink.click();
	Thread.sleep(3000);
	driver.close();
		
}


}
