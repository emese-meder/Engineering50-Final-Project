Feature: Creating an account
  Scenario: Creating an account from the home page
    Given I am on the homepage
    And I navigate to the sign in page
    When I enter an email address and click create an account
    And I enter in valid details for account creation
    Then I should have an account made

