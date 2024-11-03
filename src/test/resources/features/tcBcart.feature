Feature: Cart Feature

  Scenario: Add Products to Cart
    Given user is on the login page
    When user enters username "standard_user" and password "secret_sauce"
    Then user should see the error message "Login successful"
    When user adds two products to the cart
    Then user goes to the cart
