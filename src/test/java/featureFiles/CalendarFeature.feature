Feature:Calendar Feature Functionality

  Background:
    Given Navigate to Campus
    When  The user types username and password and click login button
    Then  The user verifies login successfully

  Scenario:Calendar Feature Check
    Given The user is on the Campus homepage
    When  The user clicks on the Calendar button on the top navigation bar
      | calendarButton |

    Then  The user views today's date and the Weekly Course Plan by default
    Then  The user views the icons (P,S,E,C) and descriptions of the scheduled lessons
    Given The user is on the Calendar page
    Then  The user should view two links to navigate to the Weekly Course Plan and Calendar pages
    And   The user clicks on these links

  Scenario:Navigating Forward and Backward on the Weekly Course Plan Page
    When  The user clicks on the Calendar button on the top navigation bar
      | calendarButton |

    Given The user is on the Weekly Course Plan page
    Then  The user should view icons to navigate forward and backward (Previous, Today, Next) on the page
    When  The user clicks on these icons
      | previousButton |
      | todayButton    |
      | nextButton     |
    Then  The user should be redirected to the corresponding date on the calendar

  Scenario:Viewing Responsible Courses on the Weekly Course Plan Page
    Given The user is on the Weekly Course Plan page
    Then  The user should view the courses they are responsible for
    When  The user clicks on a course
    Then  The user should view the details of that course