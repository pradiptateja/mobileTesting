Feature: Login Functionality
  Scenario: Ensure user failed login with invalid email
    Given user is at application homepage
    And user taps on login tab
    When user taps on login section
    And user fills invalid email
    And user taps on login button
    Then user is notified incorrect email message

  Scenario: Ensure user failed signup with invalid password
    Given user is at application homepage
    And user taps on login tab
    When user taps on login section
    And user fills valid email
    And user fills password with less than eight char
    And user taps on login button
    Then user is notified password error

  Scenario: Ensure user successfully login
    Given user is at application homepage
    And user taps on login tab
    When user taps on login section
    And user fills valid email
    And user fills correct password
    And user taps on login button
    Then user is successfully logged in