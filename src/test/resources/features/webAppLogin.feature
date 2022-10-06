
Feature: User should be able to login with correct credentials
Background:
  Given user is in web table login page

  @web_app_login
  Scenario: Web table login
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should see url contains orders

    Scenario: positive login
      When user enters username "Test", password "Tester" and login
      Then user should see url contains orders

      Scenario: map data table practice
        When user enters below credentials
          | username | Test   |
          | password | Tester |