#Author: Snehal dashapute
@ignored
Feature: Creation of Job as a client User
 
Background:
Given I am in ClientAdmin login page 
When I input client valid log in credentials {Clientusername} and {clientpassword}
And I click on log me in button
And Username should be displayed in the client homepage

@SmokeTest @RegTest
Scenario: Whether the client user is able to create the job
Given i am clicking on client job button
And i am able to see the client job fields
Given i am clicking on creating new client job tab 
And i am selecting notice type and clicking on next button
And i am providing the additional details and clicking on next button
And i am submitting the job as a client user
Then successfully job should be created