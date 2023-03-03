#Author: Snehal Dashapute
Feature: Addition of account to major agent profile as staff user

Background:
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage

Scenario: Account should be added to major agent profile
Given I am clicking on Admin tab
And I am clicking on Users tab
Then i will search for the existing major agent
Then i will open the major agent profile and navigate to the account tab
Then i will pass reference number and add the account to major agent profile
Then i am clicking on Input Account Details link for the major agent
Then I will provide all the major agent account details
