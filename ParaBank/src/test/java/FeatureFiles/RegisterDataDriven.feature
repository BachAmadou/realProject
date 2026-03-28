@Regression
Feature: Test sign up for new user

  Scenario Outline: Register for new account
    Given user launches the application
    And user is navigating to sign up page
    When user enters first name as "<FirstName>" and last name as "<LastName>"
    And user enters address as "<Address>", city as "<City>", state as "<State>" and zip code as "<ZipCode>"
    And user enters phone number as "<PhoneNumber>"
    And user enters SSN as "<SSN>"
    And user enters username as "<UserName>", password as "<Password>" and confirm password as "<ConfirmPassword>"
    Then user clicks on register button
    And validate successful registration message
    And logout of the application
    And close the application

    Examples: 
      | FirstName | LastName | Address      | City  | State  | ZipCode | PhoneNumber | SSN    | UserName | Password       | ConfirmPassword |
      | Method    | Cool     | main Street  | Mont  | Forest |  789654 |  7896556214 | 654123 | Mike     | TestData12345  | TestData12345   |
      | Red       | Smith    | bould Street | water | fire   |  852654 |  6589556214 | 987123 | Fish     | SeleDataTest45 | SeleDataTest45  |
