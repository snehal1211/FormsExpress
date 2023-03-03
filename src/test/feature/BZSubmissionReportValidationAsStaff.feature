#Author: Snehal Dashapute
Feature: Submission Report Validation as a Staff User
 
Background:
Given I am in log in page 
When I input valid log in credentials {staffusername} and {staffpassword}
And I click log me in button
And Username should be displayed in the homepage
Given i am clicking on job tab on the homepage
And i verifying the All jobs tab

@SmokeTest @RegTest
Scenario: Whether the staff is able to validate the submission type reports
Then i will search for the existing job
Then i will open the Job and navigate to the job deatils page
Then i am clicking on reports tab and select the report
