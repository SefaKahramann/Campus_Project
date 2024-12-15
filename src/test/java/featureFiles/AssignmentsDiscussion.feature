Feature:Assignment Discussion Functionality

  Background:
    Given Navigate to Campus
    When  The user types username and password and click login button
    Then  The user verifies login successfully
    And   The user clicks on the Assignment button
    When  The user selects a assignment is selected from the list and views the icons next to the assignment

  Scenario:Discussion Functionality
    When The user clicks on the Search button by selecting status Results Published and semester All options
    And  The user clicks on the Discussion icon to start a negotiation and verifies the Discussion window
    When The user clicks on the Contacts icon then selects randomly contacts
    And  The user clicks Attach Files icon to upload file and types text in Discussion chat
    Then The user verifies the text of the Sent message and Date and Time