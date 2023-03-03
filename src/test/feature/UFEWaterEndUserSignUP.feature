#Author: Snehal Dashapute
Feature: Signup for a new End user
 
Background:
Given I am in EndUser login page 

@SmokeTest @RegTest
Scenario Outline: End user should be able to signup with new credentials
Given End User will click on signup Button
When I input valid email is and ReferenceNumber {EmailId} and {ReferenceNumber}
And will click on Submit Button
And Successful Confirmation Message should be displayed
Then Broswer should be Closed

Examples:
| EmailId | ReferenceNumber | 
| EmailId | ReferenceNumber |