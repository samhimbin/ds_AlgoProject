
Feature: feature to test new user registration

  @register
  Scenario Outline: user navigate to registration page
    Given user click registration link
    When user enter username,password,confirm password from given "<sheetname>" and <rowno>
    Then user click register button with expected message

  Examples:
|sheetname |rowno |
|Sheet1    |0     |
|Sheet1    |1     |
|Sheet1    |2     |
|Sheet1    |3     |
|Sheet1    |4     |
|Sheet1    |5     |
|Sheet1    |6     |
|Sheet1    |7     |
|Sheet1    |8     |
|Sheet1    |9     |
|Sheet1    |10    |

  
   