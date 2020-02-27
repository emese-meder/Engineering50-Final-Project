Feature: Being able to delete products from a cart
  Scenario: Deleting a product from the cart
    Given a product is in the cart
    And I am on the cart page
    When I click on the delete button
    Then the product is removed from the cart