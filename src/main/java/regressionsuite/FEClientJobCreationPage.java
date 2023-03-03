package regressionsuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;
//import tooltwist.utils.ElementUtil;
import BDDframework.utils.TestUtil;

import org.junit.Assert;
public class FEClientJobCreationPage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	String ExtractedClientJOBID = "";
	
	
    public FEClientJobCreationPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    
    public void ClientJoBTabClick() throws InterruptedException {
    	WebElement ClientJobTab= driver.findElement(By.xpath(reference.ClientJobTab));
    	ClientJobTab.click();
    	Thread.sleep(5000);
    }
    
    public void checkWhetherClientJObCreationPageLoaded() throws InterruptedException {
	
		Boolean ClientJobFieldLoaded  = driver.findElement(By.xpath(reference.ClientJobHeadingVerification)).isDisplayed();
		Assert.assertTrue(ClientJobFieldLoaded);
		Thread.sleep(3000);
	
		
	}
			
	public void clickOnAddNewClientJobButton() throws InterruptedException {
		
		WebElement AddnewClientJob= driver.findElement(By.xpath(reference.ClientAddJobButton));
		AddnewClientJob.click();
		Thread.sleep(3000);
		/*
		 * WebElement JobValue= driver.findElement(By.xpath(reference.JobIDValue));
		 * this.JobString= JobValue.getText();
		 */
		
		
}
	
	
	
	public void ProvideClientNoticeType() throws InterruptedException {
		Select NoticeType = new Select(driver.findElement(By.xpath(reference.ClientNoticeTypeDropdown)));
		NoticeType.selectByVisibleText("Water");
		Thread.sleep(5000);
		WebElement NextButton1= driver.findElement(By.xpath(reference.ClientNextButton));
		NextButton1.click();
		Thread.sleep(5000);
	}
	
	public void ProvideClientAdditionalDetails() throws InterruptedException {
		
		WebElement AdditionalDetails = driver.findElement(By.xpath(reference.ClientAdditionalInstructions));
		AdditionalDetails.click();
		Thread.sleep(2000);
		WebElement AdditionalDetailsTextBox= driver.findElement(By.xpath(reference.ClientAdditionalCommentTextBox));
		AdditionalDetailsTextBox.clear();
		String ClientAditionalText="Creating a job as a Client user";
		AdditionalDetailsTextBox.sendKeys(ClientAditionalText);
		Thread.sleep(2000);
		WebElement ClientIDJobExtraction= driver.findElement(By.xpath(reference.ClientJobIDExtractionField));
		this.ExtractedClientJOBID= ClientIDJobExtraction.getText();
		/*
		 * Select ContactSel = new
		 * Select(driver.findElement(By.xpath(reference.ContactSelection)));
		 * ContactSel.selectByVisibleText("");
		 */
		/*
		 * Boolean ContactSel =
		 * driver.findElement(By.xpath(reference.ContactSelection)).isDisplayed();
		 * Assert.assertTrue(ContactSel);
		 */
		
		WebElement SecondNextButton= driver.findElement(By.xpath(reference.ClientSecondNextButton));
		SecondNextButton.click();
		Thread.sleep(8000);
		
	
}
	
	public void ClientJobSubmission() throws InterruptedException {
		
		WebElement ClientJobSubmissionButton = driver.findElement(By.xpath(reference.ClientSubmitButton));
		ClientJobSubmissionButton.click();
		Thread.sleep(8000);
		
	
		
	}	
	
	public void ClientSuccessfullyJobCreationMessage() throws InterruptedException
	{
		
		WebElement ClientJobSearchText = driver.findElement(By.xpath(reference.ClientSearchTextBox));
		ClientJobSearchText.clear();
		Thread.sleep(2000);
		ClientJobSearchText.sendKeys(ExtractedClientJOBID);
		Thread.sleep(8000);
		WebElement ClientJobIDverification= driver.findElement(By.xpath(reference.ClientJobSuccessfullyCreationIcon));
		Boolean ClientJobVerification  = ClientJobIDverification.isDisplayed();
		Assert.assertTrue(ClientJobVerification);
		Thread.sleep(2000);
		WebElement ClientLogoutLink= driver.findElement(By.xpath(reference.ClientLOgoutButton));
		ClientLogoutLink.click();
		Thread.sleep(3000);
		driver.close();
		/*
		 * Thread.s
		 * String Test2 = Message.getText(); String
		 * Test3="Success! Job has been updated."; Assert.assertEquals(Test3, Test2);
		 */
		
		
		
		
		
	}
}


