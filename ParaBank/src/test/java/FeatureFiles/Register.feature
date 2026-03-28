@Sanity
Feature: Test user registration

  Background: 
    Given user launches the application

  Scenario: Sign up for new account
    Given user is navigating to sign up page
    When user enters sign up details
      | Bob       | Cool     | 410-Street | Mont | Mountin |  789654 |  7896541230 | 654123987 | Bobbs    | Banking12345 | Banking12345 |
    Then user clicks on register button
    And validate successful registration message
    And logout of the application
    And close the application
