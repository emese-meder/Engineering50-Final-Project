Feature: Being able to change the quantity of a product in the cart

  Scenario: Increasing the quantity of the product
    Given there is a product in the cart
    And I am on the shopping cart summary
    When I click on the add quantity button
    Then the product quantity will increase

  Scenario: Decreasing the quantity of the product
    Given there is a product in the cart
    And I am on the shopping cart summary
    When I click on the decrease quantity button
    Then the product quantity will decrease