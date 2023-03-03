#Author: Snehal Dashapute
Feature: Addition of account to major agent profile as client admin

Background:
Given I am in ClientAdmin login page 
When I input client valid log in credentials {Clientusername} and {clientpassword}
And I click on log me in button
And Username should be displayed in the client homepage

Scenario: Account should be added to major agent profile
Given I am clicking on Users tab menu
Then i will search for the existing major agent as client admin
Then i will open the major agent profile and navigate to the account tab page
Then i will pass reference number and add the account to major agent profile page
Then i am clicking on the Input Account Details link
Then I will provide all the major agent account details for the account addition
