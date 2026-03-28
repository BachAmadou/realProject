# we want smoke testing all teh below scenario will run
@Smoke 
Feature: Test customer login

  Background: 
    Given user launches the application
    When user enters username and password
    And user clicks on login button
    Then display the account overview

# This will run if we want to run sanity test
	@Sanity 
  Scenario: Login a user with valid credentials
    And logout of the application
    And close the application

# This will run if we want to run regression test
	@Regression 
  Scenario: Open new account for valid user
    And user clicks on open account option
    And user clicks on open new account button
    Then new account is created
    And logout of the application
    And close the application
