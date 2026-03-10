@sanity

Feature: New Customer Creation

  Background:  
    Given user opens the login page of the application
    And user enters the username as "mngr654835"
    And user enters password as "gagedut"
    When user clicks on the login button
    Then validate user will be navigated to the homepage
    And user closes the browser

  Scenario Outline: New Customer Creation with all credentials
    And user clicks on the new Customer link
    And user enters the customername as "<customerName>"
    And user selects the gender
    And user enters the DOB as "<dOB>"
    And user enters the address as "<address>"
    And user enters the city as "<city>"
    And user enters the state as "<state>"
    And user enters the pin as "<pin>"
    And user enters the mobileNumber as "<mobileNumber>"
    And user enters the email
    And user enters the password as "<password>"
    When user clicks on the submit button
    Then new customer is created
    And user captures the customer id
    And user closes the browser

    Examples: 
      | customerName | dOB        | address | city     | state  | pin    | mobileNumber | password  |
      | Bach         | 06-08-1998 |20 main street | montreal | quebec | 701215 |   1234567890| Test@1234 |
