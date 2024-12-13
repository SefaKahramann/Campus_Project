Feature: Assignment Icons Control Functionality

  Background:
    Given Navigate to Campus
    When  The user types username and password and click login button
    Then  The user verifies login successfully
    And   The user clicks on the Assignment button
    When  The user selects a assignment is selected from the list and views the icons next to the assignment

  Scenario: Information Icon Functionality
    When The user clicks on the Information icon
    Then The user verifies the assignment details on the page
    And  The user clicks on another place without an icon from the assignment list
    Then The user verifies the assignment details on the page
    When The user clicks on the Submit icon
    Then The user verifies the submission window on the page
    When The user clicks on the Mark it icon
    Then The user verifies marked as a favorite
    When The user clicks on the Discussion icon
    Then The user verifies the discussion window on the page