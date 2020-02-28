Feature: Add to cart
  Scenario: I would like to add products to my cart and continue shopping
    Given I am on the products page
    And have added a product to my cart
    When I navigate to the womens page
    Then the cart will still have my product