Feature: Search a product in search window on main page

  Scenario Outline: User can find a product in search window

    Given User is on main page
    When user writes in searching window product <product> name
    And user clicks search button
    Then user can see search results

    Examples:
      |product|
      |bag    |
      |t-shirt|
      |hood   |
      |shoes  |
      |jeans  |