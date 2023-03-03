package regressionsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEWaterAgentLoginPage extends DriverManager {

	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEWaterAgentLoginPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
			
	public void browserlaunching()
	{
		initialization("EndUser");
	}
	
	public void inputCredentialss(String Agentusername, String Agentuserpassword) throws InterruptedException {
		
		System.out.println("Usernaem xpath"+reference.testusername);
		WebElement FEAgentusername = driver.findElement(By.xpath(reference.EndUserEmailTextBox));
		   System.out.println(ti);
		   System.out.println("Username"+ti.getAgentusername());
		  String Debug = ti.getAgentusername();
		  System.out.println(Debug);
		  String PasswordDebug= ti.getAgentpasswrd();
		  System.out.println(PasswordDebug);
		  FEAgentusername.sendKeys(ti.getAgentusername());
		   WebElement FEAgentpassword = driver.findElement(By.xpath(reference.EndUserPasswordTextBox));
		   FEAgentpassword.sendKeys(ti.getAgentpasswrd());
		   Thread.sleep(4000);
			
		}
	public void clickonloginbuttons() throws InterruptedException
	{
		   WebElement FeWaterAgentSigninBtn = driver.findElement(By.xpath(reference.EndUserLoginButton));
		   FeWaterAgentSigninBtn.click();
		   Thread.sleep(5000);
	}
	public void homepageVerifications() throws InterruptedException
	{
		  
		   WebElement HomePageTitle = driver.findElement(By.xpath(reference.HomePageVerification));
		   System.out.println(HomePageTitle.getText());
	}
	public void clickOnlogoutbuttons()
	{
		   WebElement FeWaterLogoutBtn = driver.findElement(By.xpath(reference.EndUserLogout));
		   FeWaterLogoutBtn.click();
	}

}
