Feature: Getting details of payment method

  Scenario Outline: Pick Payment Method
    Given I am on the Payment Page
    When I click on Payment <paymentType>
    Then I will go to the Detail page about <paymentType>

    Examples:
      | paymentType |
      | 'bankwire'  |
      | 'cheque'    |