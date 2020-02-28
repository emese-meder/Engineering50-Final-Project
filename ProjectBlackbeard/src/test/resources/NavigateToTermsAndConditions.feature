Feature: User being able to navigate to the terms and conditions page.

  Scenario: User wants to see the terms and conditions page so they can view the terms and conditions
    Given I am on the homepage (TermsAndConditionsStepdef).
    When I click on the terms and conditions of use link.
    Then I will be navigated to the terms and conditions.