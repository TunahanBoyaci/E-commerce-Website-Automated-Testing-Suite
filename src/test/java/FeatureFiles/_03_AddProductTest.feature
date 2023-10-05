Feature: ShoppingAddPhoneTest

  Background: ShoppingLoginTest
    Given Navigate to the webpage
    And Click on Log in button
    And Enter "JohnSmith9283" as username and "123456John" as password
    When Click on second Log in button
    Then User should be logged in successfully

    Scenario: AddProductTest
      Given Click on Phones button on navigation bar
      And Click on a product
      When Add the product
      Then User should add the product successfully