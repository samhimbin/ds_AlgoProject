Feature: user enter valid and invalid credentials for login
 @tag5
 Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and 
   <RowNumber>

    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button
    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |