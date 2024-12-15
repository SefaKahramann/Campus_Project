Feature:Calendar PopUps Functionality

  Background:
    Given Navigate to Campus
    When  The user types username and password and click login button
    Then  The user verifies login successfully

  Scenario:PopUps Functionality
    Given The user clicks on the Calendar button on the top navigation bar
      | calendarButton |

    When The user views Course Status (P,S,E,C), Course Name, and Teacher's Name of Weekly Course Plan page
    And  The user clicks on a completed (E) course
    Then The user verifies the all functions of the a opened pop-up window
      | topic        |
      | attachments  |
      | recentEvents |

    And  The user clicks on the Course Meeting that has not yet started
    Then The user verifies the Teacher's name, the Date and Time of the lesson, and warning message