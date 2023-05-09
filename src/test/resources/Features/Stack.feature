#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: user navigate to stack module and able to try Python code both valid and invalid datas
in Operations in Stack ,implementation, Applications pages
#select stack module
	@tag12
	Scenario: User select Stack module from drop down
		Given user able to click on dropdown
	  When user select stack option
	  And  user select operations in stack
	  
#select operations in stack	  
	 @tag13
	 Scenario Outline: user try python code after clicked Try here button for validation
    Given user click on Try Here button
    When user enter valid python code from given "<sheetname>" and <rowno>
    And user click run button
    Then user should see output
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
	 
	 @tag13
	 Scenario Outline: user try python code after clicked Try here button for invalidation
   Given user click on Try Here button
    When user enter invalid python code from given "<sheetname>" and <rowno>
    And user click run button
    Then user should get alert
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |1     |	
		    
	
	#select implementation option
	 
	 @tag14
	 Scenario Outline: user try python code after clicked Try here button in implenation page
	 for validation
	 	Given user select implementation
    And user click on Try Here button
    When user enter valid python code from given "<sheetname>" and <rowno>
    And user click run button
    Then user should see output
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
	 
	 @tag14
	 Scenario Outline: user try python code after clicked Try here button in implenetation page 
	 for invalidation
   Given user click on Try Here button
    When user enter invalid python code from given "<sheetname>" and <rowno>
    And user click run button
    Then user should get alert
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |1     |	
	
	
	
	
	#select applications option
	 @tag15
	 Scenario Outline: user try python code after clicked Try here button in applications page
	 for validation
	 	Given user select applications
    And user click on Try Here button
    When  user enter valid python code from given "<sheetname>" and <rowno>
    And user click run button
    Then user should see output
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
	 
	 @tag15
	 Scenario Outline: user try python code after clicked Try here button in applications page 
	 for invalidation
   Given user click on Try Here button
    When user enter invalid python code from given "<sheetname>" and <rowno>
    And user click run button
    Then user should get alert
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |1     |	
	
	#practice questions
	@tag16
	Scenario: user select practice questions
	Given user select practice questions
	And navigate back to login page

	
		