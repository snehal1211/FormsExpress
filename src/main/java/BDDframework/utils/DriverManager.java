package BDDframework.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DriverManager 
{
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
 
	 public DriverManager()
	    {
		    try 
		      {
		    	 prop = new Properties();
		    	 String filePathchrome1 = System.getProperty("user.dir") + "/src/Config/testdata.properties";
		         FileInputStream ip = new FileInputStream(filePathchrome1);
		         prop.load(ip);
		       
			  } 
		    catch (FileNotFoundException e) 
		      {
                 e.printStackTrace();
              } 
		    catch (IOException e) 
		      {
		    	e.printStackTrace();
		      }

	     }
	 public static void initialization(String URL)
	    {    
		 String browserName = prop.getProperty("browser");
		 System.out.println(browserName);
         if(browserName.equals("chrome"))
         {
        	 //String filePathchrome = System.getProperty("user.dir") + "//src//driver//chromedriver.exe";
			/*
			 * String filePathchrome = System.getProperty("user.dir") +
			 * "/src/driver/chromedriver"; System.setProperty("webdriver.chrome.driver",
			 * filePathchrome ); driver = new ChromeDriver();
			 */
             
             String filePathchrome = System.getProperty("user.dir") + "/src/driver/chromedriver.exe";
             System.setProperty("webdriver.chrome.driver", filePathchrome );
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("window-size=1400,800");
			 * options.addArguments("headless");
			 */
       	     driver = new ChromeDriver();
         }
         else if(browserName.equals("FF"))
         {
             
        	 String filePathchrome = System.getProperty("user.dir") + "//src//driver//geckodriver.exe";
             System.setProperty("webdriver.gecko.driver", filePathchrome );
       	     driver = new FirefoxDriver(); 
         }
         
         e_driver = new EventFiringWebDriver(driver);
         
         // Now create object of EventListerHandler to register it with EventFiringWebDriver
         eventListener = new WebEventListener();
         e_driver.register(eventListener);
         driver = e_driver;
         
         
             System.out.println("Before maximize");
             driver.manage().window().maximize();
             System.out.println("Before maximize");
             driver.manage().deleteAllCookies();
             
             if(URL.equals("staff"))
             {
            	driver.get(prop.getProperty("stage.environment.url"));
             }
             else if(URL.equals("EndUser"))
             {
                 
            	 driver.get(prop.getProperty("uat.environment.EndUserurl"));
             }
             
            
      		
	    }
	
}
