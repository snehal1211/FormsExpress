#Author: Snehal Dashapute
Feature: Addition of account to users profile as staff user

Background:
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage

Scenario: Account should be added to users profile
Given I am clicking on Admin tab
And I am clicking on Users tab
Then i will search for the existing user
Then i will open the user profile and navigate to the account tab
Then i will pass reference number and add the account to users profile
Then i am clicking on Input Account Details link
Then I will provide all the user account details
