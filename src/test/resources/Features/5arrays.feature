@tag
Feature: Test arrays module
  
  

  @array
  Scenario: The user is able to navigate to a page having tryEditor from arrays in python in array module 
    Given User click on get started button on array module
    When User navigate to array page
    And  User click on Arrays in Python and navigate to arrays in python page
    When User click on Try here button and navigate to tryEditor page
    Given If the User give valid  python code in tryEditor
    When User click on Run button
    Then The user should be presented with Run result
    Given If the user give invalid python code in tryEditor
    When click on Run button
    Then The user should be presented with Run error message
    
  