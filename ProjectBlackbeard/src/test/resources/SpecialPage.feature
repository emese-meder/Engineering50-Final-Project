Feature: User navigated to the specials page.
  Scenario: User wants to see the special page.
    Given I am on the homepage (SpecialPageStepdef).
    When I click on the specials link.
    Then I will be navigated to the specials page.


