@smoke
Feature:Google Search Functionality Title Verification
  User story: As a user, when I am on a Google search page
  I should be able to search whatever I want and see relevant information

  Background:
    Given User is on Google search page

  Scenario: Search functionality result title verification
    When User types apple in the Google search box and clicks enter
    Then User sees apple - Google Search is in the google title

    @googleSearch
  Scenario: Search functionality result title verification
    When User types "dog" in the Google search box and clicks enter
    Then User sees "dog - Google Search" is in the google title