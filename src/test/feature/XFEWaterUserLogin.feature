#Author: Snehal Dashapute
Feature: Staff Log in

@SmokeTest @RegTest
Scenario Outline: End user must be able to log in successfully
Given I am in EndUser login page 
When I input valid EndUser login credentials {Endusername} and {Enduserpassword}
And I click on EndUser Login button
And EndUsername should be displayed in the homepage
And Enduser should be able to logout to the application


Examples:
| Endusername | Enduserpassword | 
| Endusername | Enduserpassword |