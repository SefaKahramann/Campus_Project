Feature:Grading Functionality

  Background:
    Given Navigate to Campus
    When  The user types username and password and click login button
    Then  The user verifies login successfully

  Scenario:Grading Feature Control
    Given The user is on the Campus homepage
    When  The user clicks on the Grading button on the top navigation bar
      | gradingButton |

    Then  The user navigates to the Grading homepage
    When  The user clicks on the Course Grade button
      | courseGradeButton |

    Then  The user views the Course Grade table on the page
    When  The user clicks on the Student Transcript button
      | studentTranscriptBtn |

    Then  The user views the Student Transcript table on the page
    When  The user clicks on the Transcript By Subject button
      | transcriptBySubjectBtn |

    Then  The user views the Transcript By Subject table on the page