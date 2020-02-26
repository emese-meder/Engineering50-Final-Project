Feature: Ability to sign in.
  Scenario: User being able to sign in, in order to view account details.
    Given I am on the home page.
    When I click on the sign in button and enter correct details.
    Then I should be signed in to the website.