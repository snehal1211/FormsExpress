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
public class FELoginPage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FELoginPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
			
	public void browserlaunching()
	{
		initialization("staff");
	}
	
public void inputCredentials(String staffusername, String staffpassword) throws InterruptedException {
		
	System.out.println("Usernaem xpath"+reference.testusername);
	WebElement username1 = driver.findElement(By.xpath(reference.testusername));
	   System.out.println(ti);	
	   System.out.println("Username"+ti.getFestaffusername());
	   username1.sendKeys(ti.getFestaffusername());
	   WebElement password1 = driver.findElement(By.xpath(reference.testpassword));
	   password1.sendKeys(ti.getFestaffpassword());
	   Thread.sleep(4000);
		
	}

public void clickonloginbutton()
{
	   WebElement SigninBtn = driver.findElement(By.xpath(reference.FEloginButton));
	   SigninBtn.click();
}

public boolean displaymethod() throws InterruptedException {
	Thread.sleep(4000);
	Boolean demotabdemo = driver.findElement(By.xpath(reference.Admintab)).isDisplayed();
	Assert.assertTrue(demotabdemo);
	return demotabdemo;
}

public void clickonlogOutbutton() throws InterruptedException
{
	Thread.sleep(3000);
	   WebElement StaffLogoutButn = driver.findElement(By.xpath(reference.LogoutButton));
	   StaffLogoutButn.click();
	   Thread.sleep(3000);
	   driver.close();
}

}
