Feature: Form Functionality
  Scenario: Ensure user successfully filling a form
    Given user is at application homepage
    When user taps on Forms tab
    And user input field
    And user change switch state
    And user taps on dropdown menu
    And user selects This app is awesome
    And user taps Active button
    And user taps OK for Active confirmation
    Then user can see input field
    And user can see switch status is changed


