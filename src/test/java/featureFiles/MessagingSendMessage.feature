Feature:Messaging Send Message Functionality

  Background:
    Given Navigate to Campus
    When The user types username and password and click login button
    Then The user verifies login successfully

  Scenario:Send Message Functionality
    Given The user clicks on the hamburger menu
    When  The user hovers over the messaging link
    And   The user clicks send message
      | sendMessage |

    When  The user types and selects the receivers by clicking on the Add Receivers icon
      | usernameBox | student |

    And  The user selects the message types and types the subject for it
    And  The user types the message text and uploads the file by clicking on the Attach Files button
    Then The user clicks on the save button and verifies the confirmation message
    When The user clicks on the hamburger menu
    And  The user hovers over the messaging link
    Then The user clicks outbox message and verifies the outbox message list
      | outboxMessage |