
Feature: Ability to sign in.
  Scenario: User being able to sign in, in order to view account details.
    Given I am on the home page(SignInStepDef).
    When I click on the sign in button.
    And Enter correct email address.
    And Enter correct password.
    And Click sign in button.
    Then I should be signed in to the website.