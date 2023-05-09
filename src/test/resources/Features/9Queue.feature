
Feature: user navigate to queue module and able to try Python code both valid and invalid datas
in Queue in Python,Using Collections,Using Arrays,queue Operations,Practice Questions
#select Queue module
	@queue
	Scenario: User select Queue module from drop down
		Given user able to click on dropdown for queue
	  When user select queue option
	  And  user select queue in python
	  
#select queue in python  
	 @queue
	 Scenario Outline: user try code in queue in python after clicked Try here button for validation
    Given user click on Try Here button in queue
    When user enter valid code in queue in python from given "<sheetname>" and <rowno>
    And user click run button in queue 
    Then user should see output in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
	 
	@queue
	 Scenario Outline: user try code in queue in python after clicked Try here button for invalidation
   Given user click on Try Here button in queue
    When user enter invalid code in queue in python from given "<sheetname>" and <rowno>
    And user click run button in queue
    Then user should get alert in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |1     |	
		    
	
	#select using collections
	 @queue
	 Scenario Outline: user try python code after clicked Try here button in using collections page
	 for validation
	 	Given user select using collections
    And user click on Try Here button in queue
    When user enter valid code for using collections from given "<sheetname>" and <rowno>
    And user click run button in queue
    Then user should see output in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
	 
	 @queue
	 Scenario Outline: user try python code after clicked Try here button in usind collections page 
	 for invalidation
   Given user click on Try Here button in queue
    When user enter invalid code for using collections from given "<sheetname>" and <rowno>
    And user click run button in queue
    Then user should get alert in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |1     |	
			
	#select using array
	 @queue
	 Scenario Outline: user try python code after clicked Try here button in using array page
	 for validation
	 	Given user select using array page 
    And user click on Try Here button in queue
    When user enter valid python code for using array from given "<sheetname>" and <rowno>
    And user click run button in queue
    Then user should see output in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
	 
	 @queue
	 Scenario Outline: user try python code after clicked Try here button in using array page 
	 for invalidation
   Given user click on Try Here button in queue
    When user enter invalid python code for using array from given "<sheetname>" and <rowno>
    And user click run button in queue
    Then user should get alert in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |1     |	
	
	#select queue operations
	 @queue
	 Scenario Outline: user try python code after clicked Try here button in queue operation page
	 for validation
	 	Given user select queue operation page
    And user click on Try Here button in queue
    When user enter valid python code for queue operation from given "<sheetname>" and <rowno>
    And user click run button in queue
    Then user should see output in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
	 
	 @queue
	 Scenario Outline: user try python code after clicked Try here button in queue operation page 
	 for invalidation
   Given user click on Try Here button in queue
    When user enter invalid python code for queue operation from given "<sheetname>" and <rowno>
    And user click run button in queue
    Then user should get alert in queue
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |1     |	
	
		
	#practice questions
	@queue
	Scenario: user select practice questions in queue
	Given user select practice questions in queue
	And navigate back to login page from queue