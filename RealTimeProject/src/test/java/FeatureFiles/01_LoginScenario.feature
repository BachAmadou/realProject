@sanity

Feature: Login Feature

  Scenario Outline: Validate login functionality with correct credentials
    Given user opens the login page of the application
    And user enters the username as "<username>"
    And user enters the password as "<password>"
    When user clicks on the login button
    Then validate user will be navigated to the homepage
    And user closes the browser

    Examples: 
      | username   | password |
      | mngr654835 | gagedut  |
