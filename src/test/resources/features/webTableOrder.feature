@regression
Feature: Web table user order feature

  Scenario: User should be able to place order and order seen in the web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street name "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit cart type "American Express"
    And user enters credit card number "1111222233334444"
    And user enters expiration date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


 Scenario Template: User should be able to place order and order seen in the web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street name "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit cart type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiration date "<expirationDate>"
    And user enters process order button
    Then user should see "<firstRow>" in first row of the web table

    @FemaleScientists
    Examples: Famous female scientists
      | productType | quantity | customerName       | street    | city   | state   | zipcode | cardType | cardNumber       | expirationDate | firstRow           |
      | MoneyCog    | 2        | Marie Curie        | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Marie Curie        |
      | Familybea   | 3        | Rosalind Franklin  | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Rosalind Franklin  |
      | Screenable  | 4        | List Meitner       | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | List Meitner       |
      | MoneyCog    | 5        | Chien-Shiung Wu    | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Chien-Shiung Wu    |
      | MoneyCog    | 6        | Barbara McClintock | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Barbara McClintock |

    @MaleScientists
    Examples: Famous male scientists
      | productType | quantity | customerName          | street    | city   | state   | zipcode | cardType | cardNumber       | expirationDate | firstRow              |
      | MoneyCog    | 2        | Charles Darwin        | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Charles Darwin        |
      | Familybea   | 3        | Albert Einstein       | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Albert Einstein       |
      | Screenable  | 4        | CV Raman              | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | CV Raman              |
      | MoneyCog    | 5        | Galileo               | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Galileo               |
      | MoneyCog    | 6        | Isaac Newton          | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Isaac Newton          |
      | MoneyCog    | 6        | Arnold Schwarzenegger | London St | London | England | 50505   | Visa     | 1111222233334444 | 12/24          | Arnold Schwarzenegger |
