#Author: Snehal Dashapute
@ignored
Feature: Staff Log in

@SmokeTest @RegTest
Scenario Outline: Major Agent must be able to log in successfully
Given I am in MajorAgent login page 
When I input valid MajorAgent login credentials {Agentusername} and {Agentuserpassword}
And I click on MajorAgent Login button
And AgentUsername should be displayed in the homepage
And Agentuser should be able to logout to the application


Examples:
| Agentusername | Agentuserpassword | 
| Agentusername | Agentuserpassword |