#Author: Snehal Dashapute
@ignored
Feature: client admin Log in

@SmokeTest @RegTest
Scenario Outline: Client Admin user must be able to log in successfully
Given I am in ClientAdmin login page 
When I input client valid log in credentials {Clientusername} and {clientpassword}
And I click on log me in button
And Username should be displayed in the client homepage
And user should be able to logout to the client application


Examples:
| clientusername | clientpassword | 
| clientusername | clientpassword |