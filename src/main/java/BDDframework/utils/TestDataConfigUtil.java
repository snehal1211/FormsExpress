package BDDframework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestDataConfigUtil {
	private InputStream input = null;
	private Properties prop = null;

	private TestDataConfigUtil() {
		prop = new Properties();
		System.out.println("Inside TestDataConfigUtil method");
		try {
			
			 String PropertyFilePath = System.getProperty("user.dir") + "/src/Config/testdata.properties";
			 input = new FileInputStream(PropertyFilePath);
			//input = new FileInputStream("../BDDFramework/src/Config/testdata.properties");
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String getConfig(String configName) {
		return prop.getProperty(configName) == null ? "" : prop.getProperty(configName);
	}

	private static class TestDataConfigLazyHolder {
		private static final TestDataConfigUtil instance = new TestDataConfigUtil();
	}

	public static TestDataConfigUtil getTestDataConfig() {
		return TestDataConfigLazyHolder.instance;
	}
}
