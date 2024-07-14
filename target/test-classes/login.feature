 Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page "https://demo.nopcommerce.com/login?returnUrl=%2F"
    And the user enters a valid username "nop.practice@gmail.com"
    And the user enters a valid password "Auto12345$"
    And the user clicks the login button