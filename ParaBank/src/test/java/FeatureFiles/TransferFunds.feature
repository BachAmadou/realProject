Feature: Account holder transfer money using within bank options

  Scenario: Money transfer within bank
    When user selects transfer using within bank option
    And user selects from account
    And user selects to account
    And use clicks on transfer button
    Then money transferred successfully
