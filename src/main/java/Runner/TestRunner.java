package Runner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;



@RunWith(Cucumber.class)
@CucumberOptions(
			
   	features =
	  {"../BDDFramework/src/test/feature/XFGPaymentPageValigationEndUser.feature"}, glue = {"StepDefinition"} ,plugin = {
  "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
  }, monochrome = true,dryRun = false
 			// format= {"pretty,html:test-output"}		 
)

public class TestRunner 
{
	
	  @AfterClass
	  public static void writeExtentReport() throws IOException {
      Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
      Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
      Reporter.setSystemInfo("User Name", "Snehal Dashapute");
      Reporter.setSystemInfo("Application Name", "FormsExpress ");
      Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
      Reporter.setSystemInfo("Environment", "Staging Environment");
      Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	 }
   
}
