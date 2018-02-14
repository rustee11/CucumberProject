@tag
Feature: Login Action

@tag1 
Scenario: Enter the Country
	Given User is on demoqa home Page
	When Enter the Country
	|country|
	|india|
	|australia|
	|pakistan|
	|Africa|
	Then verify the country 