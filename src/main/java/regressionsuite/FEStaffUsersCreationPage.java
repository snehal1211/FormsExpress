package regressionsuite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEStaffUsersCreationPage extends DriverManager{

	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
	public FEStaffUsersCreationPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    public void StaffAdminTab() throws InterruptedException {
    	WebElement StaffAdmnTab= driver.findElement(By.xpath(reference.Admintab));
    	StaffAdmnTab.click();
    	Thread.sleep(5000);
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
    
    public void ProvideAllStaffUsersMandatoryFields() throws InterruptedException {
    	System.out.println("Firstname");
    	WebElement StaffFirstName = driver.findElement(By.xpath(reference.StaffFirstNameTextBox));
    	String StaffFistName ="StaffFirstName";
    	StaffFirstName.sendKeys(StaffFistName);
    	Thread.sleep(2000);
    	
    	WebElement StaffLastName = driver.findElement(By.xpath(reference.StaffLastNameTextBox));
    	String StafflstName ="StaffLastName";
    	StaffLastName.sendKeys(StafflstName);
    	Thread.sleep(2000);
    	
    	WebElement StaffEmailAddress = driver.findElement(By.xpath(reference.StaffEmailAddressTextBox));
    	String StaffEmAddress ="Staffcreation3@blazeclan.com";
    	StaffEmailAddress.sendKeys(StaffEmAddress);
    	Thread.sleep(2000);
    	
    	WebElement StaffUsername = driver.findElement(By.xpath(reference.StaffUsernameTextBox));
    	String StaffUsenm ="Staffauto12";
    	StaffUsername.sendKeys(StaffUsenm);
    	Thread.sleep(2000);
    	
    	WebElement StaffPassword = driver.findElement(By.xpath(reference.StaffPasswordTextBox));
    	String StaffPasd ="Test@1234";
    	StaffPassword.sendKeys(StaffPasd);
    	Thread.sleep(2000);
    	
    	WebElement StaffConfirmPassword = driver.findElement(By.xpath(reference.StaffConfirmPasswordTextBox));
    	String StaffConfirmPasrd ="Test@1234";
    	StaffConfirmPassword.sendKeys(StaffConfirmPasrd);
    	Thread.sleep(2000);
    	
    	Select UserType = new Select(driver.findElement(By.xpath(reference.StaffUserTypeDropDown)));
    	UserType.selectByVisibleText("Staff");
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
public void VerificationstaffMessage() throws InterruptedException
{
	//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
	String StaffEmAddress="Staffcreation3@blazeclan.com";
	Thread.sleep(2000);
	WebElement StaffUserSearchText = driver.findElement(By.xpath(reference.StaffSearchBox));
	StaffUserSearchText.clear();
	Thread.sleep(2000);
	StaffUserSearchText.sendKeys(StaffEmAddress);
	Thread.sleep(2000);
	WebElement StaffClickSearch= driver.findElement(By.xpath(reference.StaffClickSearchButton));
	StaffClickSearch.click();
	Thread.sleep(9000);
	//WebElement StaffLogoutLink= driver.findElement(By.xpath(reference.LogoutButton));
	//StaffLogoutLink.click();
	//Thread.sleep(3000);
	//driver.close();
	
}
public void ProvideAllClientAdminMandatoryFields() throws InterruptedException {
	System.out.println("Firstname");
	WebElement ClientFistName = driver.findElement(By.xpath(reference.StaffFirstNameTextBox));
	String ClienFistName ="ClientFirstName";
	ClientFistName.sendKeys(ClienFistName);
	Thread.sleep(2000);
	
	WebElement StaffLastName = driver.findElement(By.xpath(reference.StaffLastNameTextBox));
	String ClientLastName ="ClientLastName";
	StaffLastName.sendKeys(ClientLastName);
	Thread.sleep(2000);
	
	WebElement StaffEmailAddress = driver.findElement(By.xpath(reference.StaffEmailAddressTextBox));
	String ClientEmAddress ="Clientcreation3@blazeclan.com";
	StaffEmailAddress.sendKeys(ClientEmAddress);
	Thread.sleep(2000);
	
	WebElement StaffUsername = driver.findElement(By.xpath(reference.StaffUsernameTextBox));
	String StaffUsenm ="Clientauto12";
	StaffUsername.sendKeys(StaffUsenm);
	Thread.sleep(2000);
	
	WebElement StaffPassword = driver.findElement(By.xpath(reference.StaffPasswordTextBox));
	String StaffPasd ="Test@1234";
	StaffPassword.sendKeys(StaffPasd);
	Thread.sleep(2000);
	
	WebElement StaffConfirmPassword = driver.findElement(By.xpath(reference.StaffConfirmPasswordTextBox));
	String StaffConfirmPasrd ="Test@1234";
	StaffConfirmPassword.sendKeys(StaffConfirmPasrd);
	Thread.sleep(2000);
	
	Select UserType = new Select(driver.findElement(By.xpath(reference.StaffUserTypeDropDown)));
	UserType.selectByVisibleText("Client Admin");
	Thread.sleep(5000);
	Select Client = new Select(driver.findElement(By.xpath(reference.ClientDropDown)));
	Client.selectByVisibleText("FE Water");
	Thread.sleep(5000);
}
public void VerificationClientAdminMessage() throws InterruptedException
{
	//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
	String ClientEmAddress="Clientcreation3@blazeclan.com";
	Thread.sleep(2000);
	WebElement StaffUserSearchText = driver.findElement(By.xpath(reference.StaffSearchBox));
	StaffUserSearchText.clear();
	Thread.sleep(2000);
	StaffUserSearchText.sendKeys(ClientEmAddress);
	Thread.sleep(2000);
	WebElement StaffClickSearch= driver.findElement(By.xpath(reference.StaffClickSearchButton));
	StaffClickSearch.click();
	Thread.sleep(9000);	
}
public void ProvideAllEndUserMandatoryFields() throws InterruptedException {
	Select UserType = new Select(driver.findElement(By.xpath(reference.StaffUserTypeDropDown)));
	UserType.selectByVisibleText("User");
	Thread.sleep(5000);
	
	WebElement StaffEmailAddress = driver.findElement(By.xpath(reference.StaffEmailAddressTextBox));
	String enduserEmAddress ="Endusercreation3@blazeclan.com";
	StaffEmailAddress.sendKeys(enduserEmAddress);
	Thread.sleep(2000);
	
	WebElement StaffPassword = driver.findElement(By.xpath(reference.StaffPasswordTextBox));
	String StaffPasd ="Test@1234";
	StaffPassword.sendKeys(StaffPasd);
	Thread.sleep(2000);
	
	WebElement StaffConfirmPassword = driver.findElement(By.xpath(reference.StaffConfirmPasswordTextBox));
	String StaffConfirmPasrd ="Test@1234";
	StaffConfirmPassword.sendKeys(StaffConfirmPasrd);
	Thread.sleep(2000);
	
	Select Client = new Select(driver.findElement(By.xpath(reference.ClientDropDown)));
	Client.selectByVisibleText("FE Water");
	Thread.sleep(5000);
}
public void VerificationEndUserMessage() throws InterruptedException
{
	//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
	String enduserEmAddress="Endusercreation3@blazeclan.com";
	Thread.sleep(2000);
	WebElement StaffUserSearchText = driver.findElement(By.xpath(reference.StaffSearchBox));
	StaffUserSearchText.clear();
	Thread.sleep(2000);
	StaffUserSearchText.sendKeys(enduserEmAddress);
	Thread.sleep(2000);
	WebElement StaffClickSearch= driver.findElement(By.xpath(reference.StaffClickSearchButton));
	StaffClickSearch.click();
	Thread.sleep(9000);	
}
public void ProvideAllMajorAgentMandatoryFields() throws InterruptedException {
	System.out.println("Firstname");
	WebElement ClientFistName = driver.findElement(By.xpath(reference.StaffFirstNameTextBox));
	String ClienFistName ="AgentFirstName";
	ClientFistName.sendKeys(ClienFistName);
	Thread.sleep(2000);
	
	WebElement StaffLastName = driver.findElement(By.xpath(reference.StaffLastNameTextBox));
	String StafflstName ="AgentLastName";
	StaffLastName.sendKeys(StafflstName);
	Thread.sleep(2000);
	
	WebElement StaffEmailAddress = driver.findElement(By.xpath(reference.StaffEmailAddressTextBox));
	String AgentEmAddress ="Agentcreation2@blazeclan.com";
	StaffEmailAddress.sendKeys(AgentEmAddress);
	Thread.sleep(2000);
	
	WebElement StaffPassword = driver.findElement(By.xpath(reference.StaffPasswordTextBox));
	String StaffPasd ="Test@1234";
	StaffPassword.sendKeys(StaffPasd);
	Thread.sleep(2000);
	
	WebElement StaffConfirmPassword = driver.findElement(By.xpath(reference.StaffConfirmPasswordTextBox));
	String StaffConfirmPasrd ="Test@1234";
	StaffConfirmPassword.sendKeys(StaffConfirmPasrd);
	Thread.sleep(2000);
	
	Select UserType = new Select(driver.findElement(By.xpath(reference.StaffUserTypeDropDown)));
	UserType.selectByVisibleText("Agent");
	Thread.sleep(5000);
	
	Select Client = new Select(driver.findElement(By.xpath(reference.ClientDropDown)));
	Client.selectByVisibleText("FE Water");
	Thread.sleep(5000);
	
	WebElement StaffAgentCode = driver.findElement(By.xpath(reference.AgentCodeTextBox));
	String StaffAgeCode ="FTY5";
	StaffAgentCode.sendKeys(StaffAgeCode);
	Thread.sleep(2000);
	
}
public void VerificationMajorAgentMessage() throws InterruptedException
{
	//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
	String AgentEmAddress="Agentcreation2@blazeclan.com";
	Thread.sleep(2000);
	WebElement StaffUserSearchText = driver.findElement(By.xpath(reference.StaffSearchBox));
	StaffUserSearchText.clear();
	Thread.sleep(2000);
	StaffUserSearchText.sendKeys(AgentEmAddress);
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
