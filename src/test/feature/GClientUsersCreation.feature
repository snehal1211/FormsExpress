#Author: Snehal Dashapute
Feature: Creation of Users as a Staff User
 
Background:
Given I am in ClientAdmin login page 
When I input client valid log in credentials {Clientusername} and {clientpassword}
And I click on log me in button
And Username should be displayed in the client homepage

@SmokeTest @RegTest
Scenario: Whether the client admin is able to create the client admin
And I am clicking on client side Users tab
Given i am clicking on creating new client side User tab 
And i am providing all the client side mandatory details 
Then clicking on client side save button
Then clicking on client side Back button
Then success client side creation message should be displayed
Then i am clicking on creating new client side User tab 
Then i am providing all the end users mandatory details 
Then clicking on client side save button
Then clicking on client side Back button
Then success end users creation message should be displayed
Then i am clicking on creating new client side User tab 
Then i am providing all the major agents mandatory details 
Then clicking on client side save button
Then clicking on client side Back button
Then success major agents creation message should be displayed


