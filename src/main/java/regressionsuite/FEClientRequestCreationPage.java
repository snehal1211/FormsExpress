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
public class FEClientRequestCreationPage extends DriverManager{
	
	//private static final CharSequence RequestNUmber = null;
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEClientRequestCreationPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    
public void clickOnClientRequestTab() {
		
		WebElement REquestClientTab= driver.findElement(By.xpath(reference.ClientRequestTab));
		REquestClientTab.click();
		
		
		
}

public void checkWhetherRequestCreationPageLoaded() throws InterruptedException {
	Thread.sleep(5000);
	Boolean ClientRequestValidation  = driver.findElement(By.xpath(reference.ClientRequestHeadline)).isDisplayed();
	Assert.assertTrue(ClientRequestValidation);

	
}

String ClientRequestNumber = "";

public void clickOnAddNewRequestButton() throws InterruptedException {
	WebElement ClientREquestAddButton = driver.findElement(By.xpath(reference.ClientRequestAddButton));
	ClientREquestAddButton.click();
	Thread.sleep(6000);
	
	WebElement ClientReqstID= driver.findElement(By.xpath(reference.ClientRequestIDExtraction));
	String ClientRqstID= ClientReqstID.getText();
	String[] arrOfRqstStr = ClientRqstID.split(" "); 
	//String RequestNUmber = arrOfStr[2];
	String RequestNumber = "";
	this.ClientRequestNumber = arrOfRqstStr[2];
	System.out.println(this.ClientRequestNumber); 
	
	
}



public void ProvideAllRequestFields() throws InterruptedException {
	Select ClientREQUESTProduct = new Select(driver.findElement(By.xpath(reference.ClientProductDropdown)));
	ClientREQUESTProduct.selectByVisibleText("Other");
	Thread.sleep(3000);
	
	WebElement ClientRequestSubject = driver.findElement(By.xpath(reference.ClientRequestSubjectTextbox));
	String ClientRqstSubject ="Client Test Request Creation";
	ClientRequestSubject.sendKeys(ClientRqstSubject);
	Thread.sleep(2000);
	
	WebElement ClientRequestDescription = driver.findElement(By.xpath(reference.ClientRequestDescriptionTextbox));
	String ClientDescription ="Client please create the test request";
	ClientRequestDescription.sendKeys(ClientDescription);
	Thread.sleep(2000);
	
	WebElement ClientRqstSaveBttn = driver.findElement(By.xpath(reference.ClientRequestSaveButton));
	ClientRqstSaveBttn.click();
	Thread.sleep(2000);
	
}

public void REquestVerificationMessage() throws InterruptedException
{
	Thread.sleep(12000);
	WebElement ClientSearch = driver.findElement(By.xpath(reference.ClientRequestSearchBox));
	ClientSearch.clear();
	Thread.sleep(3000);
ClientSearch.sendKeys(ClientRequestNumber);
Thread.sleep(7000);
WebElement RequestFormExpressTab = driver.findElement(By.xpath(reference.ClientRequestFormsExpressTab));
RequestFormExpressTab.click();
Thread.sleep(10000);
//WebElement RequestClientSearchvrfy = driver.findElement(By.xpath(reference.ClientRequestSearchVerification));
//String ClientSearchValue= RequestClientSearchvrfy.getText();


//Assert.assertEquals(ClientRequestNumber, ClientSearchValue);
//Thread.sleep(3000);
WebElement ClientLogoutButtonLink = driver.findElement(By.xpath(reference.ClientLOgoutButton));
ClientLogoutButtonLink.click();
Thread.sleep(3000);
driver.close();
	
	
	
	
	
}




	
}


