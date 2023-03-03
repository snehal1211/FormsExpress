package regressionsuite;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;
public class FEClientAdminLoginpage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEClientAdminLoginpage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
			
	public void browserlaunching()
	{
		initialization("staff");
	}
	
public void inputCredentials(String clientusername, String clientpassword) throws InterruptedException {
		
	System.out.println("Usernaem xpath"+reference.testusername);
	WebElement username1 = driver.findElement(By.xpath(reference.testusername));
	   System.out.println(ti);
	   System.out.println("Username"+ti.getClientusername());
	   username1.sendKeys(ti.getClientusername());
	   WebElement password1 = driver.findElement(By.xpath(reference.testpassword));
	   password1.sendKeys(ti.getClientpassword());
	   Thread.sleep(4000);
		
	}

public void clickonloginbutton()
{
	   WebElement SigninBtn = driver.findElement(By.xpath(reference.FEloginButton));
	   SigninBtn.click();
}

public void displaymethod() throws InterruptedException {
	Thread.sleep(4000);
	Boolean ClientOrganizationTab = driver.findElement(By.xpath(reference.ClientLoginVerification)).isDisplayed();
	Assert.assertTrue(ClientOrganizationTab);
	
}

public void clickonClientlogOutbutton() throws InterruptedException
{
	   Thread.sleep(2000);
	   WebElement ClientLogOutButn = driver.findElement(By.xpath(reference.ClientLOgoutButton));
	   ClientLogOutButn.click();
	   Thread.sleep(3000);
	   driver.close();
}

}

