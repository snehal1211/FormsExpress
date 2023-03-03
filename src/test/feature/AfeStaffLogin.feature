#Author: Snehal Dashapute
Feature: Staff Log in

@SmokeTest @RegTest
Scenario Outline: Staff user must be able to log in successfully
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage
And user should be able to logout to the application


Examples:
| staffusername | staffpassword |
| staffusername | staffpassword |