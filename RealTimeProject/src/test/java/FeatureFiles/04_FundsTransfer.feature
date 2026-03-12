Feature: Make funds transfer

  Background: 
    Given user opens the login page of the application
    And user enters the username as "mngr654835"
    And user enters password as "gagedut"
    When user clicks on the login button
    Then validate user will be navigated to the homepage

  Scenario Outline: Make a fund transfer
    And user clicks Fund Transfer link
    And user enters Payers account no
    And user enters Payees account no
    And user enters amount
    And user enters description
    When user clicks on the submit button
    Then validate user can see fund transfer details is displayed
