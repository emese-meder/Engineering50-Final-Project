Feature: Quickest path to buy an item
  Scenario: Confirming payment
    Given I am on the home page
    And I hover over a popular item and click add to basket
    And I click proceed to checkout
    And I click on the proceed to checkout button
    And I enter an email address and click create an account
    And I enter in valid details for account creation
    And I click on the proceed to checkout button on the address page
    And I agree to the terms and conditions
    And I then click the proceed to checkout button on the shipping page
    And I choose to pay by bank wire
    When I click I confirm my order
    Then I will be able to view the order details page