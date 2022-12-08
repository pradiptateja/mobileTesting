Feature: Swipe Functionality
  Scenario: Ensure user can found compatible card
    Given user is at application homepage
    When user taps on Swipe tab
    Then user founds compatible card by swiping horizontally

  Scenario: Ensure user can found hidden robot
    Given user is at application homepage
    When user taps on Swipe tab
    Then user founds hidden robot by swiping vertically