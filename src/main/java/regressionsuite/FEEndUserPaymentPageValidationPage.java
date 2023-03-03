package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEEndUserPaymentPageValidationPage extends DriverManager{
	
	//private static final CharSequence RequestNUmber = null;
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEEndUserPaymentPageValidationPage(TestInit ti) 
	{
		this.ti = ti;  
	}
    
public void clickOnNoticesandPaymentTab() throws InterruptedException {
	
	WebElement NoticesandPaymentTab= driver.findElement(By.xpath(reference.EndUserNoticesandPaymentLink));
	NoticesandPaymentTab.click();
	Thread.sleep(2000);
}
public void clickOnPayButton() throws InterruptedException {
	
	WebElement ClickPayButton= driver.findElement(By.xpath(reference.EndUserPayButton));
	ClickPayButton.click();	
	Thread.sleep(4000);
}
public void SelectTheRecurringPaymentOption() throws InterruptedException {
	
	WebElement ClickOnAddButton= driver.findElement(By.xpath(reference.EndUserClickonAddButton));
	ClickOnAddButton.click();
	Thread.sleep(8000);
	
	
}
public void ProvideAllThePaymentDetails() throws InterruptedException {

	WebElement SelectPaymentMethod= driver.findElement(By.xpath(reference.EndUserSelectPaymentMethod));
	SelectPaymentMethod.click();
	Thread.sleep(2000);
	
	WebElement CardHolderName= driver.findElement(By.xpath(reference.EndUserEnterCardHolderName));
	String HolderName ="Snehal";
	CardHolderName.sendKeys(HolderName);
	Thread.sleep(2000);
	
	WebElement CreditCardNumber= driver.findElement(By.xpath(reference.EndUserEnterCreditCardNumber));
	String CardNumber ="4111111111111111";
	CreditCardNumber.sendKeys(CardNumber);
	Thread.sleep(2000);
	
	Select ExpiryDate = new Select(driver.findElement(By.xpath(reference.EndUserSelectExpiryDate)));
	ExpiryDate.selectByVisibleText("23");
	Thread.sleep(3000);
	
	WebElement CVN= driver.findElement(By.xpath(reference.EndUserEnterCVN));
	String CVNNumber ="123";
	CVN.sendKeys(CVNNumber);
	Thread.sleep(2000);
	
	WebElement NextButton= driver.findElement(By.xpath(reference.EndUserClickNextButton));
	NextButton.click();
	Thread.sleep(7000);
}

String Captchacode = "";
public void ProvideTheCaptchaCode() throws InterruptedException {
	
	WebElement GetCaptchaCode= driver.findElement(By.xpath(reference.EndUserGetCaptchaCode));
	String Captchacode=GetCaptchaCode.getText();
	System.out.println("get captcha code"+ Captchacode);
	Thread.sleep(2000);
	
	WebElement EnterCaptchCode= driver.findElement(By.xpath(reference.EndUserEnterCaptchaCode));
	EnterCaptchCode.sendKeys(Captchacode);
	Thread.sleep(2000);
	
	WebElement ConfirmButton= driver.findElement(By.xpath(reference.EndUserClickConfirmButton));
	ConfirmButton.click();
	Thread.sleep(5000);
	
	
}


}



