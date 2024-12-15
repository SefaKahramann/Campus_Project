Feature:Upload Profile Photo Functionality

  Background:
    Given Navigate to Campus
    When  The user types username and password and click login button
    Then  The user verifies login successfully

  Scenario:Upload Profile Photo
    Given The user clicks on the Profile and selects the Settings link in the Profile menu
    When  The user clicks on the Upload Picture button to upload or change Profile Photo
    And   The user views the type of Profile Photo and size of the image by clicking on the Upload button
    Then  The user clicks on the save button and displays Success message