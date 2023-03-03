package regressionsuite;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;
public class FEStaffJobCreationPage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	String JobString = "";
	File file;
	
    public FEStaffJobCreationPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
			
	public void clickOnAddNewJobButton() throws InterruptedException {
		
		WebElement AddnewJob= driver.findElement(By.xpath(reference.AddJobButton));
		AddnewJob.click();
		Thread.sleep(3000);
		WebElement JobValue= driver.findElement(By.xpath(reference.JobIDValue));
		this.JobString= JobValue.getText();
			
}
	
	
	public void checkWhetherJObCreationPageLoaded() throws InterruptedException {
		Thread.sleep(3000);
		Boolean FieldLoaded  = driver.findElement(By.xpath(reference.JobFieldLoaded)).isDisplayed();
		Assert.assertTrue(FieldLoaded);
		Thread.sleep(3000);
	}
	public void ProvideAllJobFields() throws InterruptedException {
		Select select = new Select(driver.findElement(By.xpath(reference.adminClientDropdown)));
		select.selectByVisibleText("FE Water");
		Thread.sleep(2000);
		
		Select sel = new Select(driver.findElement(By.xpath(reference.adminNoticeTypeDropdown)));
		sel.selectByVisibleText("Automated Rates - Rates");
		Thread.sleep(2000);
		
		Select se = new Select(driver.findElement(By.xpath(reference.adminAssigneeDropdown)));
		se.selectByVisibleText("Snehal Dashapute - rijil.daniel@blazeclan.com");
		Thread.sleep(2000);
		
		Select s = new Select(driver.findElement(By.xpath(reference.adminStatusDropdown)));
		s.selectByVisibleText("Submitted");
		
		
		Thread.sleep(3000);
		
	}
	
	/*public void SelectDataDetails() throws InterruptedException, IOException {	
		Thread.sleep(1000);
		WebElement Data = driver.findElement(By.xpath(reference.DataTab));
		Data.click();
		
		File directoryPath = new File("C:/multiplefiles");
		File filesList[] = directoryPath.listFiles();
		System.out.println("List of files and directories in the specified directory:");
		for(File file : filesList) {
	         System.out.println("File path: "+file.getAbsolutePath());
	         String path=file.getAbsolutePath();
	         WebElement Uploadfile = driver.findElement(By.xpath(reference.UploadFile));
				Uploadfile.sendKeys(path);
	      }

		Thread.sleep(5000);			
}*/
		
	public void SelectContactDetails() throws InterruptedException {
		
		WebElement Contacts = driver.findElement(By.xpath(reference.ContactTab));
		Contacts.click();
		Thread.sleep(3000);
		Boolean ContactSel  = driver.findElement(By.xpath(reference.ContactSelection)).isDisplayed();
		Assert.assertTrue(ContactSel);
		//Select s1 = new Select(driver.findElement(By.xpath(reference.ContactSelection)));
		//s1.selectByVisibleText("snehal dashapute - snehal.dashapute@blazeclan.com");
		Thread.sleep(3000);
}
	
	public void AdditionalInstructionFeild() throws InterruptedException {
		
		WebElement AdditionalInstruc = driver.findElement(By.xpath(reference.AdditionalInstructions));
		AdditionalInstruc.click();
		Thread.sleep(2000);
		/*
		 * String demo= "Test job has been created successfully"; WebElement
		 * Instructiontab =
		 * driver.findElement(By.xpath(reference.AdditionalInstructionsTextBox));
		 * Instructiontab.clear(); Thread.sleep(2000); Instructiontab.sendKeys(demo);
		 */
		WebElement Save= driver.findElement(By.xpath(reference.SaveButton));
		Save.click();
		Thread.sleep(4000);
		WebElement ContinueBut= driver.findElement(By.xpath(reference.ContinueButton));
		ContinueBut.click();
		Thread.sleep(3000);
	
		
	}	
	
	public void VerificationMessage() throws InterruptedException
	{
		//WebElement Message = driver.findElement(By.xpath(reference.SuccessMessage));
		Thread.sleep(8000);
		WebElement JobSearchText = driver.findElement(By.xpath(reference.JobIDSearchBox));
		JobSearchText.clear();
		Thread.sleep(2000);
		JobSearchText.sendKeys(JobString);
		Thread.sleep(7000);
		WebElement JobIDverify= driver.findElement(By.xpath(reference.JobIDVerification));
		Boolean JobVerification  = JobIDverify.isDisplayed();
		Assert.assertTrue(JobVerification);
		Thread.sleep(2000);
		WebElement StaffLogoutLink= driver.findElement(By.xpath(reference.LogoutButton));
		StaffLogoutLink.click();
		Thread.sleep(3000);
		driver.close();
		
		/*
		 * String Test2 = Message.getText(); String
		 * Test3="Success! Job has been updated."; Assert.assertEquals(Test3, Test2);
		 */
		
		
		
		
	}
}

