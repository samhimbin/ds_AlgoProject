@home
Feature: evaluate home page
 
  Scenario: User navigate to home page
    Given User click on Data Structures dropdown
    When  User click on arrays from the dropdown
    Then  It  shows error message "You are not logged in"
  
  
  Scenario: Launch url and navigate to home page
    When User click on one of the module from home page
    Then It is showing error message You are not logged in