package regressionsuite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEWaterEndUserProfileUpatePage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	String ExtractedClientJOBID = "";
	
	
    public FEWaterEndUserProfileUpatePage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    public void UserViewDetailsLink() throws InterruptedException {
    	WebElement ViewDetailsLink= driver.findElement(By.xpath(reference.UserViewDetailsLink));
    	ViewDetailsLink.click();
    	Thread.sleep(5000);
    }
    
    public void UserProfileUpdateDetails() throws InterruptedException {
    	WebElement FirstNameTextBox= driver.findElement(By.xpath(reference.UserFirstNameTextBox));
    	FirstNameTextBox.clear();
    	Thread.sleep(1000);
    	String FirstName="Ajit123";
    	FirstNameTextBox.sendKeys(FirstName);
    	WebElement LastNameTextBox= driver.findElement(By.xpath(reference.UserLastNameTextBox));
    	LastNameTextBox.clear();
    	Thread.sleep(1000);
    	String LastName="sandbhor";
    	LastNameTextBox.sendKeys(LastName);
    	WebElement MobileNumberTextBox= driver.findElement(By.xpath(reference.UserMobileNumberTextBox));
    	MobileNumberTextBox.clear();
    	Thread.sleep(1000);
    	String MobileNumber="9878675676";
    	MobileNumberTextBox.sendKeys(MobileNumber);
    	WebElement SaveProfileButton= driver.findElement(By.xpath(reference.UserProfileSaveButton));
    	SaveProfileButton.click();
    	Thread.sleep(1000);
    	WebElement ExtractUpdatedName= driver.findElement(By.xpath(reference.UserProfileSaveSuccessfully));
    	String Extracttext=ExtractUpdatedName.getText();
    
        String ActualName="Ajit123 sandbhor";
		  Assert.assertEquals(Extracttext, ActualName);
		 
			Thread.sleep(2000);
    
    }
    

}
