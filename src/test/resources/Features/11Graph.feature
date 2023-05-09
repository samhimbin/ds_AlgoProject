
Feature: Evaluate Graph Module in Dsalgo portal

    @graph
    Scenario: The user navigates to Graph page
    Given user is in homepage after logging in with valid credentials
    When  user picks graph option from dropdown menu
    Then  user will be directed to Graph module page 
   
    @graph
	Scenario Outline: user navigating graph page to evaluate
    Given The user is in a try here page having  tryEditor with a Run button to test
    And   user clicks on tryHere button
    When  The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
    And   user click on Run button
    Then  The user should be presented with the output

  Examples:
|sheetname |rowno |
|Sheet1    |0     |

