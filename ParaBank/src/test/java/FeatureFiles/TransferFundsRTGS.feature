Feature: Account holder transfer money using RTGS options

  Scenario: Money transfer within bank
    Given user launches the application
    And user enters username as {string}, password as {string}
    And user navigates to fund transfer page
    When user selects transfer using rtgs option
    And user selects from account
    And user selects to account
    And use clicks on transfer button
    Then money transferred successfully
    And logout of the application
    And close the application
