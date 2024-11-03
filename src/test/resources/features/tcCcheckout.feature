Feature: Checkout Feature

  Scenario: Successful Checkout
    Given user is on the login page
    When user enters username "standard_user" and password "secret_sauce"
    Then user should see the error message "Login successful"
    When user checks out with first name "John", last name "Doe", and postal code "12345"
    Then user should see checkout error message "Checkout successful"

  Scenario: Checkout with Missing Postal Code
    Given user is on the login page
    When user enters username "standard_user" and password "secret_sauce"
    Then user should see the error message "Login successful"
    When user checks out with first name "John", last name "Doe", and postal code ""
    Then user should see checkout error message "Postal code is required"
