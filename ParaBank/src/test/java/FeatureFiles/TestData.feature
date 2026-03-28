@Regression
Feature: Test customer login

  Background: 
    Given user launches the application

  Scenario: Login a user with invalid credentials
    When user enters username as "bank12345" and password as "bank123"
    And user clicks on login button
    Then validate error message
    And close the application
