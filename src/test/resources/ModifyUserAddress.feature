Feature: Being able to modify the user address
  Scenario: Navigating to the update address page
    Given I am signed in
    And have an item in the cart
    And on the address page
    When I click on the update button
    Then I will be able to update my address
