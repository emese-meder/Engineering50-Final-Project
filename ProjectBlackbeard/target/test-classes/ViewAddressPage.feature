Feature: Allow user to view all their addresses.

  Scenario: Let users view addresses to check they are up to date.
    Given I am logged in.
    When I click on the ‘My addresses’ button.
    Then I will be directed to the ‘My addresses’ page.