package regressionsuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;
//import tooltwist.utils.ElementUtil;
import BDDframework.utils.TestUtil;

import org.junit.Assert;
public class FEWaterEndUserSignUpPage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEWaterEndUserSignUpPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
			
	public void browserlaunching()
	{
		initialization("EndUser");
	}
	
	public void ClickOnSignUPButton() throws InterruptedException
	{
	WebElement SignUPButn = driver.findElement(By.xpath(reference.EndUserSignUpBUtton));
	SignUPButn.click();
	Thread.sleep(2000);
	}
	
public void inputCredentials(String EmailId, String ReferenceNumber) throws InterruptedException {
		
	System.out.println("Usernaem xpath"+reference.testusername);
	WebElement SignUPEmail = driver.findElement(By.xpath(reference.EndUserSignUPEmailTextBox));
	  // System.out.println(ti);
	  // System.out.println("Username"+ti.getFestaffusername());
	SignUPEmail.sendKeys(ti.getEmailId());
	   WebElement ReferenceNumbr = driver.findElement(By.xpath(reference.EndUserReferenceNumberTextBox));
	   ReferenceNumbr.sendKeys(ti.getReferenceNumber());
	   Thread.sleep(4000);
		
	}

public void SIgnUpConfirmationButton() throws InterruptedException
{
	   WebElement SignUpConfrmBtn = driver.findElement(By.xpath(reference.SignUPCOnfirmationButton));
	   SignUpConfrmBtn.click();
	   Thread.sleep(4000);
		
		  WebElement SignUpYsBtn =
		  driver.findElement(By.xpath(reference.SignUPYesButton)); SignUpYsBtn.click();
		 
	   
	   
	   Thread.sleep(4000);
	   
}




public void confirmationMessage() throws InterruptedException {
	Thread.sleep(4000);
	Boolean ConfirmationCheck = driver.findElement(By.xpath(reference.SignUPConfirmationMessage)).isDisplayed();
	Assert.assertTrue(ConfirmationCheck);
	
}

	/*
	 * public void clickonlogOutbutton() throws InterruptedException {
	 * Thread.sleep(3000); WebElement StaffLogoutButn =
	 * driver.findElement(By.xpath(reference.LogoutButton));
	 * StaffLogoutButn.click(); Thread.sleep(3000); driver.close(); }
	 */
public void closeBrowser() throws InterruptedException
{
	Thread.sleep(2000);
	   
	   driver.close();
}
}
