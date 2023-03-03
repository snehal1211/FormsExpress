#Author: Snehal Dashapute
Feature: System Report Validation as a Staff User
 
Background:
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage

@SmokeTest @RegTest
Scenario: Whether the staff is able to validate the System type reports
Given I am clicking on staff1 Admin tab
Then I am clicking on sytem reports tab
Then Select the organisation and select all the reports
