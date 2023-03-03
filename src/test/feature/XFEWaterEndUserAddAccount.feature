#Author: Snehal Dashapute
@ignored
Feature: Add Account as End User

Background:
Given I am in EndUser login page 
When I input valid EndUser login credentials {Endusername} and {Enduserpassword}
And I click on EndUser Login button
And EndUsername should be displayed in the homepage

@SmokeTest @RegTest
Scenario: Whether the end user is able to Add Account
Given I am clicking on Add your notice link
Then i will pass reference number and add the account to end users profile