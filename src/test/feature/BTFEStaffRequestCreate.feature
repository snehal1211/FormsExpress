#Author: Snehal Dashapute
Feature: Creation of Request as a Staff User
 
Background:
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage

@SmokeTest @RegTest
Scenario: Whether the staff user is able to create the Request
Given i am clicking on Request button
And i am able to see the Request fields
Given i am clicking on creating new Request tab 
And i am providing all the mandatory details and clicking on save button
Then success message should be displayed
