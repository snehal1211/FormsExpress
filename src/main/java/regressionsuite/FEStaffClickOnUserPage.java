package regressionsuite;

import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BDDframework.utils.DriverManager;
import BDDframework.utils.ObjectReference;
import BDDframework.utils.TestInit;

public class FEStaffClickOnUserPage extends DriverManager{
	//private static final CharSequence RequestNUmber = null;
		ObjectReference reference = new ObjectReference();
		private TestInit ti = null;
		
		
	    public FEStaffClickOnUserPage(TestInit ti) 
		{
			this.ti = ti; 
			
		}
	    public void clickOnAdminTab() {
			
			WebElement AdminTabButton= driver.findElement(By.xpath(reference.AdminLink));
			AdminTabButton.click();		
	}
	    
      public void clickOnUserTab() throws InterruptedException {
    	    
    	  LocalDateTime now2=null;
    	  long Difference=0;
			for(int i=0;i<500;i++)
			{
			WebElement UserTabButton= driver.findElement(By.xpath(reference.Userlink));
			UserTabButton.click();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalDateTime now1 = LocalDateTime.now();
			if(now2!=null)
			{
				 Difference = (now1.getSecond()-now2.getSecond());
			}
			now2=now1;
			
			System.out.println("Count - "+i+" : "+Difference);				
			}
			
	} 

}
