Feature:Assignment Icons Control Functionality

  Background:
    Given Navigate to Campus
    When  The user types username and password and click login button
    Then  The user verifies login successfully
    And   The user clicks on the Assignment button
    When  The user selects a assignment is selected from the list and views the icons next to the assignment

  Scenario:Icons Control Functionality
    When The user clicks on the Information icon
    Then The user verifies the assignment details on the page
    And  The user goes back the Assignment list
      | backButton |

    And  The user clicks on another place without an icon from the assignment list
    Then The user verifies the assignment details on the page
    And  The user goes back the Assignment list
      | backButton |

    Then The user clicks on the Submit icon and verifies the submission window on the page
    And  The user goes back the Assignment list
      | backButton |

    Then The user clicks on the Discussion icon and verifies the discussion window on the page
    And  The user goes back the Assignment list
      | backButton |

    Then The user clicks on the Mark it icon and verifies marked as a favorite