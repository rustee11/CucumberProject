@tag
Feature: Login Action
  
 @tag1
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When Enter "<fname>" and "<lname>"
	Then verify the entered "<fname>" and"<lname>"	
	
Examples:
|fname|lname|
|vinoth|rusty|	