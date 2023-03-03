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
public class FEStaffRequestCreationPage extends DriverManager{
	
	//private static final CharSequence RequestNUmber = null;
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEStaffRequestCreationPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
    
public void clickOnRequestTab() {
		
		WebElement REquestTabButton= driver.findElement(By.xpath(reference.Requesttab));
		REquestTabButton.click();
		
	
}

public void checkWhetherRequestCreationPageLoaded() throws InterruptedException {
	Thread.sleep(4000);
	Boolean RequestFieldLoaded  = driver.findElement(By.xpath(reference.AllRequestTab)).isDisplayed();
	Assert.assertTrue(RequestFieldLoaded);

	
}

String RequestNumber = "";

public void clickOnAddNewRequestButton() throws InterruptedException {
	WebElement REquestAddButton = driver.findElement(By.xpath(reference.AddRequestButton));
	REquestAddButton.click();
	Thread.sleep(6000);
	
	WebElement ReqstID= driver.findElement(By.xpath(reference.RequestID));
	String Stext= ReqstID.getText();
	String[] arrOfStr = Stext.split(" "); 
	//String RequestNUmber = arrOfStr[2];
	String RequestNumber = "";
	this.RequestNumber = arrOfStr[2];
	System.out.println(this.RequestNumber); 
	
	
}



public void ProvideAllRequestFields() throws InterruptedException {
	Select REQUESTProduct = new Select(driver.findElement(By.xpath(reference.RequestProduct)));
	REQUESTProduct.selectByVisibleText("Other");
	Thread.sleep(3000);
	
	WebElement RequestSubject = driver.findElement(By.xpath(reference.RequestSubject));
	String Subject ="Test Request Creation";
	RequestSubject.sendKeys(Subject);
	Thread.sleep(2000);
	
	WebElement RequestDescription = driver.findElement(By.xpath(reference.REquestDEscription));
	String Description ="please create the test request";
	RequestDescription.sendKeys(Description);
	Thread.sleep(2000);
	
	WebElement RequestSaveButton = driver.findElement(By.xpath(reference.RequestSaveButton));
	RequestSaveButton.click();
	Thread.sleep(2000);
	
}

public void REquestVerificationMessage() throws InterruptedException
{
	Thread.sleep(12000);
	WebElement Search = driver.findElement(By.xpath(reference.SearchBox));
	Search.clear();
	Thread.sleep(2000);
Search.sendKeys(RequestNumber);
//Thread.sleep(7000);
//WebElement SearchChk = driver.findElement(By.xpath(reference.SearchCheck));
//String SearchValue= SearchChk.getText();
//Assert.assertEquals(RequestNumber, SearchValue);
Thread.sleep(12000);
WebElement logoutButton= driver.findElement(By.xpath(reference.LogoutButton));
logoutButton.click();
Thread.sleep(3000);
driver.close();
	
	
	
}




	
}


