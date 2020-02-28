Feature: Ability to change the colour of the products.
  Scenario:  User is able to select a colour option
    Given I am on the clothes viewing page.
    When I select a colour
    Then The colour of the product has been changed