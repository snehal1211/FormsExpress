package BDDframework.utils;

import org.openqa.selenium.WebDriver;

import BDDframework.utils.TestUtil;
//import tooltwist.utils.ElementUtil;
//import tooltwist.utils.DriverManager;
//import tooltwist.utils.TestDataConfigUtil;


public class TestInit
{
	private TestDataConfigUtil config = null;
	private String environmentUrl = "";
	
	//LoginURL
	private String urlSet = "";
	private String urlGet = "";
	private String userurlSet = "";
	private String userurlGet = "";
	//Credentials
	//private String username = "";
	private String staffusername = "";
	private String EmailId="";
    private String ReferenceNumber="";
	public String getEmailId() {
		return EmailId=this.config.getConfig("FEWaterEndUserEmailID");
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getReferenceNumber() {
		return ReferenceNumber=this.config.getConfig("FEWaterReferenceNUmber");
	}

	public void setReferenceNumber(String referenceNumber) {
		ReferenceNumber = referenceNumber;
	}

	public String getEnduserpasswrd() {
		return Enduserpasswrd=this.config.getConfig("FEEndUserPassword");
	}

	public void setEnduserpasswrd(String enduserpasswrd) {
		Enduserpasswrd = enduserpasswrd;
	}
	public String getAgentpasswrd() {
		return Agentpasswrd=this.config.getConfig("FEMajorAgentPassword");
	}

	public void setAgentpasswrd(String agentpasswrd) {
		Agentpasswrd = agentpasswrd;
	}

	private String staffpassword = "";
	private String clientusername="";
	private String clientpassword="";
	private String username="";
	private String Enduserpasswrd="";
	private String Endusername="";
	private String Agentpasswrd="";
	private String Agentusername="";
	
	
	public String getEndusername() {
		return Endusername = this.config.getConfig("FEEndUsername");
	}

	public void setEndusername(String endusername) {
		this.Endusername = endusername;
	}
	public String getAgentusername() {
		return Agentusername = this.config.getConfig("FEAgentUsername");
	}

	public void setAgentusername(String agentusername) {
		this.Agentusername = agentusername;
	}

	public String getClientusername() {
		return clientusername= this.config.getConfig("FEClientusername");
	}

	public void setClientusername(String clientusername) {
		this.clientusername = clientusername;
	}

	public String getClientpassword() {
		return clientpassword= this.config.getConfig("FEClientPassword");
	}

	public void setClientpassword(String clientpassword) {
		this.clientpassword = clientpassword;
	}

	//private String staffpassword = "";
	public String getFestaffusername() {
		return staffusername = this.config.getConfig("FEstaffUsername");
	}

	public void setFestaffusername(String festaffusername) {
	  this.staffusername = staffusername;
	}

	public String getFestaffpassword() {
		return staffpassword = this.config.getConfig("FEstaffPassword");
	}

	public void setFestaffpassword(String festaffpassword) {
		this.staffpassword = staffpassword;
	}

	private TestUtil testUtil =  null;
	private WebDriver driver =  null;
	
	
	
	public TestInit() throws Exception { 
		System.out.println(">>>>>>>>>>>>>>>>>>>> Initializing TestInit <<<<<<<<<<<<<<<<<<<<");
		
		this.config = TestDataConfigUtil.getTestDataConfig();
		/*
		 * this.driver = new DriverManager().getDriver(); if (this.driver == null) {
		 * throw new Exception("Driver instance is null"); }
		 */
		//this.config = TestDataConfigUtil.getTestDataConfig();
		this.testUtil = new TestUtil();
		
		
		//Set Login URL
		String  urlSet = "";
		String urlGet = "";
	    String userurlSet = "";
	    String userurlGet = "";

	}
	
    public TestDataConfigUtil getConfig() {
		return config;
	}

	public void setConfig(TestDataConfigUtil config) {
		this.config = config;
	}

	public String getEnvironmentUrl() {
		return environmentUrl;
	}

	public void setEnvironmentUrl(String environmentUrl) {
		this.environmentUrl = environmentUrl;
	}
	
	public TestUtil getTestUtil() {
		return testUtil;
	}

	public void setTestUtil(TestUtil testUtil) {
		this.testUtil = testUtil;
	}
	
	
	public String getLoginURL() {
		
		return urlSet = this.config.getConfig("loginURL");
	}
	
	

//Login Credentials
	public String getUsername() {
		return username = this.config.getConfig("staffUsername");
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStaffpassword() {
		return staffpassword = this.config.getConfig("staffPassword");
	}

	public void setStaffpassword(String staffpassword) {
		this.staffpassword = staffpassword;
	}	
	
		
}
