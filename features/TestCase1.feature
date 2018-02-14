@tag
Feature: Login Action

@tag1 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When Enter_Firstname and Lastname
	Then Logout the browser
	
	
	