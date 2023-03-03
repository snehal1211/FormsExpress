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
public class FEWaterEndUserLOgin extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEWaterEndUserLOgin(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
			
	public void browserlaunching()
	{
		initialization("EndUser");
	}
	
public void inputCredentials(String Endusername, String Enduserpassword) throws InterruptedException {
		
	System.out.println("Usernaem xpath"+reference.testusername);
	WebElement FEEndusername = driver.findElement(By.xpath(reference.EndUserEmailTextBox));
	   System.out.println(ti);
	   System.out.println("Username"+ti.getEndusername());
	  String Debug = ti.getEndusername();
	  System.out.println(Debug);
	  String PasswordDebug= ti.getEnduserpasswrd();
	  System.out.println(PasswordDebug);
			  FEEndusername.sendKeys(ti.getEndusername());
	   WebElement FEEndUserpassword = driver.findElement(By.xpath(reference.EndUserPasswordTextBox));
	   FEEndUserpassword.sendKeys(ti.getEnduserpasswrd());
	   Thread.sleep(4000);
		
	}

public void clickonloginbutton() throws InterruptedException
{
	   WebElement FeWaterSigninBtn = driver.findElement(By.xpath(reference.EndUserLoginButton));
	   FeWaterSigninBtn.click();
	   Thread.sleep(5000);
}

	/*
	 * public boolean displaymethod() throws InterruptedException {
	 * Thread.sleep(4000); Boolean demotabdemo =
	 * driver.findElement(By.xpath(reference.Admintab)).isDisplayed();
	 * Assert.assertTrue(demotabdemo); return demotabdemo; }
	 * 
	 * public void clickonlogOutbutton() throws InterruptedException {
	 * Thread.sleep(3000); WebElement StaffLogoutButn =
	 * driver.findElement(By.xpath(reference.LogoutButton));
	 * StaffLogoutButn.click(); Thread.sleep(3000); driver.close(); }
	
	 */
public void homepageVerification() throws InterruptedException
{
	  
	   WebElement HomePageTitle = driver.findElement(By.xpath(reference.HomePageVerification));
	   System.out.println(HomePageTitle.getText());
}
public void clickOnlogoutbutton() throws InterruptedException
{
	   WebElement FeWaterLogoutBtn = driver.findElement(By.xpath(reference.EndUserLogout));
	   FeWaterLogoutBtn.click();
	   Thread.sleep(3000);
	   driver.close();
}


}

