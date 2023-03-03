#Author: Snehal Dashapute
Feature: Creation of Job as a Staff User
 
Background:
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage
Given i am clicking on job tab on the homepage
And i verifying the All jobs tab

@SmokeTest @RegTest
Scenario: Whether the staff user is able to create the job
Given i am clicking on creating new job tab 
And i am able to see the job fields
And i am providing all the mandatory details in job page
And click on contact tab and select the contact details
And click on Additional details Tab and provide the details
Then success job message should be displayed