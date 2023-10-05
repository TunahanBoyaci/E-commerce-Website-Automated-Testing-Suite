Feature: BuyProductTest

  Background: ShoppingLoginTest
    Given Navigate to the webpage
    And Click on Log in button
    And Enter "JohnSmith9283" as username and "123456John" as password
    When Click on second Log in button
    Then User should be logged in successfully

  Scenario: BuyProductTest
    Given Navigate to the cart
    When Click on Place Order
    Then User should be able to buy the product