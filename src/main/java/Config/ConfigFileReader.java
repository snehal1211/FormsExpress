package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader 
{
	Properties prop = new Properties();
	public String getReportConfigPath() throws IOException
	{
		
		String filePathchrome1 = System.getProperty("user.dir") + "/src/main/java/Config/Configuration.properties";
		//FileReader reader=new FileReader();
		//String filePathchrome1 = "C:/Users/Administrator/Downloads/BDDFramework/src/main/java/Config/Configuration.properties";
		System.out.println("File location is"+filePathchrome1);
		FileInputStream ip = new FileInputStream(filePathchrome1);
        prop.load(ip);
		/*prop.load(reader);*/
		String reportConfigPath = prop.getProperty("reportConfigPath");
		System.out.println("reportConfigPath-"+reportConfigPath);
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
