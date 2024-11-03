Feature: Login Feature

  Scenario: Successful Login
    Given user is on the login page
    When user enters username "standard_user" and password "secret_sauce"
    Then user should see the error message "Login successful"

  Scenario: Invalid Username
    Given user is on the login page
    When user enters username "invalid_user" and password "secret_sauce"
    Then user should see the error message "Username and password do not match any user in this service"

  Scenario: Invalid Password
    Given user is on the login page
    When user enters username "standard_user" and password "wrong_password"
    Then user should see the error message "Username and password do not match any user in this service"

  Scenario: Blank Username
    Given user is on the login page
    When user enters username "" and password "secret_sauce"
    Then user should see the error message "Username is required"
