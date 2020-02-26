Feature: Website works with multiple drivers

  Scenario Outline: Clicking on the Women button
    Given I am using a <browser>
    When I click on the WOMEN button on nav bar
    Then I will be on the Women page

    Examples:
      | browser  |
      | 'chrome' |
      | 'edge'   |
      | 'firefox'|