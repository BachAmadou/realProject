@sanity

Feature: Create a new account

  Background: 
    Given user opens the login page of the application
    And user enters the username as "mngr654835"
    And user enters password as "gagedut"
    When user clicks on the login button
    Then validate user will be navigated to the homepage

  Scenario Outline: New account type creation
    And user clicks on new account link
    And user enters customer id
    And user selects the account type
    And user enters the initial deposit amount
    When user clicks on the submit button
    Then validate user can see the new account information is displayed
