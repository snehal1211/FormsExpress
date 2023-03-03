#Author: Snehal Dashapute
@ignored
Feature: Add Account as Major Agent

Background:
Given I am in MajorAgent login page 
When I input valid MajorAgent login credentials {Agentusername} and {Agentuserpassword}
And I click on MajorAgent Login button
And AgentUsername should be displayed in the homepage

@SmokeTest @RegTest
Scenario: Whether the major agent is able to Add Account
Given I am clicking on Add your notice link
Then i will pass reference number and add the account to major agent profiles