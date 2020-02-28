Feature: Being able to view the cart drop down menu

  Scenario: Viewing the cart drop down menu
    Given I am on the home page(CartDropDownStepdef)
    And have a item in the cart(CartDropDownStepdef)
    When I hover on the cart button
    Then I should see the item I selected