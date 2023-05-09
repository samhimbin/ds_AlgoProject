

Feature: Evaluate Data stuructures Introduction
  
  @dstruct
  Scenario Outline: User is able to navigate Data Structures Introduction
	Given User click on Get started button in data Structures module
	When User click on Time Complexity button
	And click Try here button and navigate to try edidor page
 	When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
   
   @dstruct 
   Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given click Try here button and navigate to try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
    
    @dstruct
    Scenario: User is able to navigate to practice questions
    Given User click on practice questons
    And Navigate back to data stuctures introduction page
 