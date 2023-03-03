#Author: Snehal Dashapute
Feature: Payment Page validation for end user
 
Background:
Given I am in EndUser login page 
When I input valid EndUser login credentials {Endusername} and {Enduserpassword}
And I click on EndUser Login button
And EndUsername should be displayed in the homepage

@SmokeTest @RegTest
Scenario: Whether the user is able to pay the amount for the notice
Given i am clicking on Notices and Payment tab
Then clicking on pay button
Then Select the Recurring payment options and select payment method as credit card
Then Provide the payment details and click on next button
Then Enter the captcha code and click on confirm button



