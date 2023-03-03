package BDDframework.utils;

public class ObjectReference 
{
  
   //test123
   //FEStaffLOginCredentials
   public static String testusername = "//*[@id='emailAddress']";
   public static String testpassword = "//*[@id='loginForm']/div/div[3]/div/input";
   public static String FEloginButton = "//*[@id='loginForm']/div/div[4]/a";
   public static String Userprofile= "//a[@class='btn btn-default profile-name-link']";
   public static String Admintab = "//i[@class='fa fa-cog']";
   public static String Alljobstab ="//a[text()='All Jobs']";
   public static String JobButton ="//i[@class='fa fa-briefcase']";
   public static String AddJobButton ="//i[@class='fa fa-plus-circle add-clr fa-3x']";
   public static String adminClientDropdown = "//select[@class='form-control select-account']";
   public static String adminNoticeTypeDropdown = "//select[@class='form-control docTypeList']";
   public static String adminAssigneeDropdown = "//select[@class='form-control assigned']";
   public static String adminStatusDropdown = "//select[@class='form-control statusList stat-date']";
   public static String JobFieldLoaded ="//h1[@class='page-header pull-left']";
   public static String DataTab="//li[@class='active cb-data']//a[contains(text(),'Data')]";
   public static String UploadFile="//input[@name='qqfile']";
   public static String ContactTab="//li[@class='cb-basic-information']";
   public static String ContactSelection="//select[@class='contact-list form-control']";
   public static String AdditionalInstructions="//li[@class='cb-additional-comment']";
   public static String AdditionalInstructionsTextBox="//textarea[@class='form-control comment']";
   public static String SaveButton = "//input[@id='saveBtn']";
   public static String JobIDValue = "//*[@id='job-identifier']";
   public static String ContinueButton = "//button[@class='nb-btn btn btn-success modal-submit-btn']";
   public static String RequestID = "//h1[@class='page-header pull-left']";
   public static String SuccessMessage= "//*[contains(@class,'alert-success')]//*[contains(text(),'Job has been updated')]";
   public static String JobIDSearchBox="//*[@id='searchkey']";
   public static String JobIDVerification="//*[@class='text-nowrap'][2]";
   public static final String LogoutButton="//i[@class='fa fa-sign-out']";
   
   //StaffCreateRequest
   
   
   public static String Requesttab = "//i[@class='fa fa-suitcase']";
   public static String AddRequestButton ="//i[@class='fa fa-plus-circle add-clr fa-3x']";
   public static String RequestProduct ="//select[@class='form-control']";
   public static String RequestSubject ="//input[@name='field_1']";
   public static String REquestDEscription ="//textarea[@name='field_2']";
   public static String RequestSaveButton ="//button[@class='btn btn-success save-btn']";
   public static String SearchBox = "//*[@id='searchkey']";
   public static String AllRequestTab ="//a[text()='All Requests']";
   public static String SearchCheck="//*[@class='text-nowrap'][1]";
  // public static String SuccessMessageTest= "//*[contains(@class,'message')]//*[contains(text(),'Success! Request has been added.')]";
   public static String SuccessMessageTest= "//span[text()='Success! Request has been added.']";
   
   //ClientAdminLogin
   
   //*[@class='sb-menu-myorg']
   public static String ClientLoginVerification =" //*[@class='sb-menu-myorg']";
   public static String ClientRequestTab=" //i[@class='fa fa-suitcase']";
   public static String ClientRequestHeadline="//h1[@class='page-header']";
   public static String ClientRequestSearchBox="//input[@id='searchkey']";
   public static String ClientRequestAddButton ="//i[@class='fa fa-plus-circle add-clr fa-3x']";
   public static String ClientProductDropdown ="//select[@name='field_77']";
   public static String ClientRequestSubjectTextbox ="//input[@name='field_1']";
   public static String ClientRequestDescriptionTextbox ="//textarea[@name='field_2']";
   public static String ClientRequestSaveButton ="//button[@class='btn btn-success save-btn']";
   public static String ClientRequestIDExtraction="//h1[@class='page-header pull-left']";
   public static String ClientRequestFormsExpressTab="//a[contains(text(),'Forms Express')]";
   //public static String ClientRequestFormsExpressTab="//li[@class='forms-express-tab active']";
   public static String ClientRequestSearchVerification="//td[@class='text-nowrap'][1]";
   
   //Client Admin Job Creation
   public static String ClientJobTab ="//i[@class='fa fa-briefcase']";
   public static String ClientJobHeadingVerification="//h1[@class='page-header']";
   public static String ClientAddJobButton="//i[@class='fa fa-plus-circle add-clr fa-3x']";
   public static String ClientSearchTextBox="//input[@id='searchkey']";
   public static String ClientNoticeTypeDropdown="//select[@class='form-control customer-notice-type-select form-input']";
   public static String ClientNextButton="//button[@class='nb-btn btn btn-success next-step'][1]";
   public static String ClientAdditionalInstructions="//li[@class='cb-additional-comment']";
   public static final String ClientAdditionalCommentTextBox="//textarea[@class='form-control comment']";   
   public static final String ClientSecondNextButton="//button[@class='nb-btn btn btn-success next-step'][2]";
   public static final String ClientJobIDExtractionField="//*[@class='job-id-label']";
   public static final String ClientSubmitButton="//button[@class='nb-btn btn btn-success submit-btn']";
   public static final String ClientJobSuccessfullyCreationIcon ="//td[@class='text-nowrap']";
   public static final String ClientLOgoutButton="//a[@class='logout-link']";
   
   //staff Admin AccountbyReference NUmber and account number and name
   //1172287
   
   public static final String AdminTab="//i[@class='fa fa-cog']";
   public static final String UsersTab="//i[@class='fa fa-users']";
   public static final String UserSearchTextBox="//input[@placeholder='Enter Email, First Name or Last Name']";
   public static final String UsersSearchButton="//input[@value='Search']";
   public static final String UsersProfileOpeningButton="//i[@class='fa fa-list']";
   public static final String AgentProfileOpeningButton="//td[contains(text(),'Agent')]";
   public static final String StaffAccountsTab="//i[@class='fa fa-calculator']";
   public static final String ReferenceNumberTextBox="//input[@class='form-control txtAdd']";
   public static final String ReferenceNumberAddButton="//input[@class='btn-success btn btnAdd']";
   public static final String AccountAdditionSuccessButton="//button[contains(text(),'Yes')]";
   public static final String AccountVerificationSearchTextBox="//input[@id='search_key']";
   public static final String AccountHolderName="//td[contains(text(),'Forms Express 5')]";
   public static final String InputAccountDeatailsTab ="//a[text()='Input Account Details']";
   public static final String UserAddAccountNumberTextBox="//input[@name='accountNumberDialog']";
   public static final String UserAddAccountNameTextBox="//input[@name='accountNameDialog']";
   public static final String UserselectAccountCategoryDropdown="/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/form/div[4]/div/div[2]/div/button";
   public static final String MAselectAccountCategoryDropdown="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/form/div[4]/div/div[2]/div/button";
   public static final String AccountAdditionAddButton="//button[contains(text(),'Add')]";
   public static final String UserselectAccountCategoryRates="/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/form/div[4]/div/div[2]/div/div/ul/li[1]/a";
   public static final String MAselectAccountCategoryRates="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/form/div[4]/div/div[2]/div/div/ul/li[1]/a/span[1]";

   //FEEndUser Login
   
   public static final String EndUserEmailTextBox="//input[@placeholder='Email or Mobile number']";
   public static final String EndUserPasswordTextBox="//input[@placeholder='Password']";
   public static final String EndUserLoginButton ="//button[@class='btn btn-primary sign-in']";
   public static final String EndUserSignUpBUtton="//span[@class='sign-up-label']";
   public static final String EndUserSignUPEmailTextBox="//input[@id='userEmail1']";
   public static final String EndUserReferenceNumberTextBox="//input[@name='refNumber']";
   public static final String SignUPCOnfirmationButton="//button[@class='btn btn-success form-control sign-up']";
   public static final String SignUPYesButton="//button[@onclick=\"CoBrandLogin.register('endUser');\"]";
   public static final String SignUPConfirmationMessage="//h3[contains(text(),'Check your email')]";
   public static final String HomePageVerification="//h4[contains(text(),'Welcome,')]";
   public static final String EndUserLogout="//a[@class='logout-link']";
 
   //FEEndUser Payment Validation
   public static final String EndUserNoticesandPaymentLink="/html/body/div[1]/aside/nav/div/ul[1]/li[2]/a";
   public static final String EndUserPayButton="//i[@class='btn btn-success pay_button']";
   public static final String EndUserClickonAddButton="//button[@class='btn btn-success dropdown-toggle add-payment";
   public static final String EndUserSelectPaymentMethod="//span[text()='Credit card']";
   public static final String EndUserEnterCardHolderName="//input[@name='cardholderName']";
   public static final String EndUserEnterCreditCardNumber="//input[@name='creditCardNumber']";
   public static final String EndUserEnterCVN="//input[@name='cvn']";
   public static final String EndUserSelectExpiryDate="//select[@id='expiryDateYear']";
   public static final String EndUserClickNextButton="//input[@id='nextButton']";
   public static final String EndUserGetCaptchaCode="//img[@id='captchaImage']";
   public static final String EndUserEnterCaptchaCode="//input[@id='captchaCode']";
   public static final String EndUserClickConfirmButton="//input[@id='confirmButton']";
   
  
   
   
   //FEEndUser Account AddByRefrence Number
   
   public static final String UserAddNoticeLink="//a[@href='/account']";
   public static final String UserAddAccountTextBox="//input[@name='signUpCode']";
   public static final String UserAddNoticeLinkButton="//input[@class='btn-success btn']";
   public static final String UserAccountAdditionSuccessButton="//button[contains(text(),'Yes')]";
   public static final String UserAccountVerificationSearchTextBox="//input[@id='search_key']";
   public static final String UserAccountHolderName="//td[contains(text(),'Forms Express 28')]";
   
   
   //FEEndUser Add Additional Email Add
   
   public static final String UserEmailsTab="//a[contains(text(),'Emails')]";
   public static final String UseradditionaleNoticesemailTextBox="//input[@id='inputEmail']";
   public static final String UserAddadditionalemailAddButton="//input[@name='addEmailButton']";
   public static final String UserAdditionalEmailName="//td[contains(text(),'as@gmail.com')]";
   
   
   //EndUser Profile Update
   public static final String UserViewDetailsLink="//a[contains(text(),'View details')]";
   public static final String UserFirstNameTextBox="//input[@id='firstName']";
   public static final String UserLastNameTextBox="//input[@id='lastName']";
   public static final String UserMobileNumberTextBox="//input[@id='mobileNumber']";
   public static final String UserProfileSaveButton="//a[@id='saveBtn']";
   public static final String UserProfileSaveSuccessfully="//a[@class='btn btn-default profile-name-link']";
   
   //MajorAgentDownloadNotices
   public static final String AgentNoticesandPaymentLink="//ul[@id='majorAgentSidebar']//a[contains(text(),'Notices and Payment')]";
   public static final String AgentSelectAllNoticesCheckbox="//input[@id='selectAllCheckboxes']";
   public static final String AgentDownloadNoticesButton="//button[@class='downloadNotice btn-warning']";
   
   //Creation of Users as a Staff User
   
   public static String StaffAddUsersButton="//i[@class='fa fa-plus-circle add-clr fa-3x open-wizards']";
   public static String StaffUserTypeDropDown="//select[@name='userType']";
   public static String StaffFirstNameTextBox="//input[@id='user-first-name']";
   public static String StaffLastNameTextBox="//input[@id='user-last-name']";
   public static String StaffEmailAddressTextBox="//input[@id='user-email']";
   public static String StaffUsernameTextBox="//input[@id='user-username']";
   public static String StaffPasswordTextBox="//input[@id='user-password']";
   public static String StaffConfirmPasswordTextBox="//input[@id='user-confirm-password']";
   public static String StaffSaveButton="//a[@id='saveBtn']";
   public static String StaffUserBackButton="//a[@href='/users']";
   public static String StaffSearchBox="//input[@id='searchkey']";
   public static String StaffClickSearchButton="//input[@id='searchRecords']";
   public static String ClientDropDown="//select[@name='account']";
   public static String AgentCodeTextBox="//input[@id='agent-code']";
   
   //Validation of Submission Type Report
   public static final String JobSearchTextBox="//input[@placeholder='Enter Job ID, Notes or Reference Number']";
   public static final String JobOpeningButton="//i[@class='fa fa-times-circle fa-2x text-danger']";
   public static final String StaffReportsTab ="//a[contains(text(),'Reports')]";
   public static final String StaffSubmissionReportDropdown = "//select[@class='form-control state']";
   
 //Validation of System Type Report
   public static final String SystemReportTabButton="//i[@class='fa fa-file-text-o']";
   public static final String AdvancedSearchTab="//i[@class='fa fa-caret-up']";
   public static final String SelectOrganisation="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/form/div[1]/div/div[2]/div/div/button";
   public static final String SearchOrganisation="//input[@class='form-control']";
   public static final String ClickOrganisation="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/form/div[1]/div/div[2]/div/div/div/ul/li[94]/a";
   public static final String ApplyButton="//a[@class='btn btn-warning filter-apply']";
   public static final String SelectAllActiveReport="//td[contains(text(),'All Active Users in System')]";
   public static final String SelectAllNonActiveReport="//td[contains(text(),'All Non-Active Users in System')]";
   public static final String SelectActiveBpayReport="//td[contains(text(),'Active BPAY Users Report')]";
   public static final String SelectDeactivatedBpayReport="//td[contains(text(),'Deactivated BPAY users report')]";
   public static final String SelectFailedBpayReport="//td[contains(text(),'Failed BPay users report')]";
   public static final String SelectActiveEmailCustomersReport="//td[contains(text(),'Active Email Customers Report')]";
   public static final String SelectDuplicateRegisteredAccountReport="//td[contains(text(),'Duplicate Registered Account Report')]";
   public static final String ClientSystemReportsDropdown = "//select[@class='form-control selectReports pull-left browser-default custom-select custom-select-lg mb-3']";
   public static final String ClientRunButton="//button[contains(text(),'Run')]";
   
   
}
