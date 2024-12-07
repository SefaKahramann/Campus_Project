Feature: Login Functionality

  Scenario: Login with invalid username and password
  Given Navigate to campus
    When The user types invalid username and password
    And The user clicks on the login button
    Then The user verifies warning message

  Scenario: Login with valid username and password

    Given Navigate to Campus
    When The user types username and password and click login button
    Then The user verifies login successfully
