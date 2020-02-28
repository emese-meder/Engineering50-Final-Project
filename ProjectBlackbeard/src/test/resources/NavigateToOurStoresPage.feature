Feature: User navigated to the our stores page.

  Scenario: User wants to view the nearby stores
    Given I am on the homepage(OurStoresStepdef).
    When I click on the our stores link.
    Then I will be navigated to the our stores page.