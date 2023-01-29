Feature: Select product from Women section and add to cart

  Scenario: User can select random Women product and add it to cart

    Given User is on main page
    When user goes to women subpage
    And user selects random women product
    And user clicks add to cart button
    Then user sees confirmation message
    When user goes to cart
    Then user can see product in the cart