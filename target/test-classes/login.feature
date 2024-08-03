Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page "https://demo.nopcommerce.com/login?returnUrl=%2F"
    And the user enters a valid username "nop.practice@gmail.com"
    And the user enters a valid password "Auto12345$"
    And the user clicks the login button

  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page "https://demo.nopcommerce.com/login?returnUrl=%2F"
    And the user enters a valid username "<username>"
    And the user enters a valid password "<password>"
    And the user clicks the login button
    Then the user should be logged in successfully

    Examples: 
      | username               | password   |
      | nop.practice@gmail.com | Auto12345$ |
