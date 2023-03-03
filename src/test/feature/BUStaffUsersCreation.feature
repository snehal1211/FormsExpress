#Author: Snehal Dashapute
Feature: Creation of Users as a Staff User
 
Background:
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage

@SmokeTest @RegTest
Scenario: Whether the staff user is able to create the staff User
Given I am clicking on staff Admin tab
And I am clicking on staff Users tab
Given i am clicking on creating new User tab 
And i am providing all the user mandatory details 
Then clicking on save button
Then clicking on Back button
Then success user creation message should be displayed
Then i am clicking on creating new User tab 
Then i am providing all the client admin mandatory details
Then clicking on save button
Then clicking on Back button
Then success client creation creation message should be displayed
Then i am clicking on creating new User tab 
Then i am providing all the end user mandatory details
Then clicking on save button
Then clicking on Back button
Then success end user creation message should be displayed
Then i am clicking on creating new User tab 
Then i am providing all the major agent mandatory details
Then clicking on save button
Then clicking on Back button
Then success major agent creation message should be displayed 


