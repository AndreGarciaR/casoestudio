Feature: GlobalSQA user registration
  As a user of the website
  I want to register
  to get into the web portal

  Scenario: user registration on GlobalSQA website
    Given that Juan wants to register with GlobalSQA
    When  the user enters the data required by the system
      |firstName |lastName |userName | password|
      |Juan|Perez|Jperez|Perez1235|
    Then the user is successfully registered



