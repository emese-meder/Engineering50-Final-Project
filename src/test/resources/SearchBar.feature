Feature: Ability to search for a product
  Scenario: Being able to search for a dress
    Given I am on the homepage on I want to search
    When I enter dress in the search bar
    Then I will presented with the results

  Scenario: Being able to search for a t-shirt
    Given I am on the homepage on I want to search
    When I enter t-shirt in the search bar
    Then I will presented with the results for t-shirt