Feature: ShoppingLoginTest
  Scenario: ShoppingLoginTest
    Given Navigate to the webpage
    And Click on Log in button
    And Enter "JohnSmith9283" as username and "123456John" as password
    When Click on second Log in button
    Then User should be logged in successfully
