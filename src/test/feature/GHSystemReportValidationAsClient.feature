#Author: Snehal Dashapute
Feature: System Report Validation as a Client Admin
 
Background:
Given I am in ClientAdmin login page 
When I input client valid log in credentials {Clientusername} and {clientpassword}
And I click on log me in button
And Username should be displayed in the client homepage

@SmokeTest @RegTest
Scenario: Whether the Client Admin is able to validate the System type reports
Given I am clicking on client sytem reports tab
Then select all the reports