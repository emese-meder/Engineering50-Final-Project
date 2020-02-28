Feature: User being navigated to the new products page.

  Scenario: User wants to see what products are on offer
    Given I am on the homepage (NewProductsOnOfferStepdef).
    When I click on the new products link.
    Then I will be navigated to the new products page.