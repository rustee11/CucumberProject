@tag
Feature: Login Action
 @tag1
Scenario: L
	Given User is on Home Page
	When Enter_Firstname and Lastname
	|fname|lname|
	|vinoth|rustee|
	|Karlitto|Corner|
	Then verify Firstname and Lastname	
	