Feature: Buy a product

  Scenario: User can select product and buy it

    Given user is on main page
    When user goes to men subpage
    And user selects random men product
    And user clicks add to cart button
    Then user sees confirmation message
    When user goes to cart
    Then user can see product in the cart
    When user clicks proceed to checkout
    Then user is on checkout page
    When user enters first name <name>, last name <surname>, street <street>, town <town>, zip code <zip>, phone <phone>, email<email>
    And user clicks place order button
    Then user sees error message about invalid payment method

