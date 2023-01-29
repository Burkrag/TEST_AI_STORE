Feature: Select product from Best Seller section and go to product page

  Scenario: user can select product from best seller section

    Given User is on main page
    When user selects random product from best sellers section
    Then user is on product page


