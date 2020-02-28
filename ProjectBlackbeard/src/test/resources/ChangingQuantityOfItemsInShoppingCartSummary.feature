Feature: Being able to change the quantity of a product in the cart

  Scenario: Increasing the quantity of the product
    Given I am on the homepage (QuantityOfItemsStepDef)
    And there is a product in the cart(QuantityOfItemsStepDef)
    And I am on the shopping cart summary(QuantityOfItemsStepDef)
    When I click on the add quantity button
    Then the product quantity will increase

  Scenario: Decreasing the quantity of the product
    Given I am on the homepage (QuantityOfItemsStepDef)
    And there is a product in the cart(QuantityOfItemsStepDef)
    And I am on the shopping cart summary(QuantityOfItemsStepDef)
    When I click on the decrease quantity button
    Then the product quantity will decrease