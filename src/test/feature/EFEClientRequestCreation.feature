#Author: Snehal Dashapute
Feature: Creation of Request as a client User
 
Background:
Given I am in ClientAdmin login page 
When I input client valid log in credentials {Clientusername} and {clientpassword}
And I click on log me in button
And Username should be displayed in the client homepage

@SmokeTest @RegTest
Scenario: Whether the client user is able to create the Request
Given i am clicking on client Request button
And i am able to see the client Request fields
Given i am clicking on creating new client Request tab 
And i am providing all the client mandatory details and clicking on save button
Then Request should be created