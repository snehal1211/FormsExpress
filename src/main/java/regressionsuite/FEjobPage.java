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
public class FEjobPage extends DriverManager{
	
	ObjectReference reference = new ObjectReference();
	private TestInit ti = null;
	
	
    public FEjobPage(TestInit ti) 
	{
		this.ti = ti; 
		
		//this.driver = ti.getDriver(); 
	}
			
	public void clickOnJobButton() {
		
		WebElement jobbutton= driver.findElement(By.xpath(reference.JobButton));
		jobbutton.click();
		
}
	
	public boolean checkAllJobsTab() throws InterruptedException {
		Thread.sleep(3000);
		Boolean AlljobstabText  = driver.findElement(By.xpath(reference.Alljobstab)).isDisplayed();
		Assert.assertTrue(AlljobstabText);
		return AlljobstabText;
	}
}
