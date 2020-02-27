Feature: Ability to sign out.
  Scenario: Being able to sign out so that no one else can access my account.
    Given I am on the home page(SignOutStepDef).
    And click sign in.
    And Enter correct email-address.
    And Enter correct pass.
    And Click sign-in button.
    When I click on sign-out.
    Then I will be signed out of my account.