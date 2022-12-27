Feature: Drag and Drop Functionality
  Scenario: Ensure user successfully finishing puzzle
    Given user is at application homepage
    And user taps on drag tab
    When user drag and drop puzzle pieces
    Then user is notified congratulations message