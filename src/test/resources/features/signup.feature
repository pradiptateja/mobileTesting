Feature: Signup Functionality
  Scenario: Ensure user failed signup with invalid email
    Given user is at application homepage
    And user taps on login tab
    When user taps on signup section
    And user fills invalid email
    And user taps on signup button
    Then user is notified incorrect email message

  Scenario: Ensure user failed signup with invalid password
    Given user is at application homepage
    And user taps on login tab
    When user taps on signup section
    And user fills valid email
    And user fills password with less than eight char
    And user taps on signup button
    Then user is notified password error

  Scenario: Ensure user failed signup with incorrect password confirmation
    Given user is at application homepage
    And user taps on login tab
    When user taps on signup section
    And user fills valid email
    And user fills correct password
    And user fills different password confirmation
    And user taps on signup button
    Then user is notified password confirmation error

  Scenario: Ensure user successfully signup
    Given user is at application homepage
    And user taps on login tab
    When user taps on signup section
    And user fills valid email
    And user fills correct password
    And user fills correct password confirmation
    And user taps on signup button
    Then user is successfully signup

