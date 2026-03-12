Feature: Log out 


  Background: 
    Given user opens the login page of the application
    And user enters the username as "mngr654835"
    And user enters password as "gagedut"
    When user clicks on the login button
    Then validate user will be navigated to the homepage
    
    Scenario Outline: customer can logout after signing
    And user can logout 