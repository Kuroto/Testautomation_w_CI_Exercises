Feature: Add two numbers

  #Background:
    #Given I log in to the website "https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php"

  Scenario: Add two numbers.
    Given I use "Edge" as browser
    And there is a first number 20
    And there is a second number 50
    When calculating the result
    Then the I should get the result 70

  Scenario: Add two numbers.
    Given I use "Chrome" as browser
    And there is a first number 70
    And there is a second number 30
    When calculating the result
    Then the I should get the result 100

  Scenario: Add two numbers.
    Given I use "Firefox" as browser
    And there is a first number 1000
    And there is a second number 500
    When calculating the result
    Then the I should get the result 1500