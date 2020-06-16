Feature: Amazon Singapore Search

  Scenario: Select the product from search bar
    Given Browser is launched and amazon.sg is open on browser
    When Enter "laptop" in search bar on home page
    Then Select first search from the auto-complete and click enter
    And Land on the product page and close browser

