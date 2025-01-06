Feature: Calculator

  #Background: Happens before each test scenario.
    #Given the test case start with this
    #And then something else happens

  #Scenario: Add two numbers (uncomment to test this)
    #Given I have two numbers, 15.5 and 20.5.
    #When I add the two numbers.
    #Then I get the result 36.0.

  Scenario Outline: Add two numbers using Scenario Outline
    Given I have two numbers, <First Number> and <Second Number>
    When I <Operation> two numbers.
    Then I get the result <Result>.

    Examples:
      | First Number | Second Number | Operation | Result |
      | 15.0         | 20.0          | add       | 35.0   |
      | 50           | 70            | add       | 120    |
      | 100          | 400           | subtract  | -300   |
      | 10           | 20            | multiply  | 200    |
      | 15           | 3             | divide    | 5      |
      | -22          | 23            | add       | 1      |

  #Scenario: Subtract two numbers
    #Given I have two numbers, 75.5 and 15.5.
    #When I subtract two numbers.
    #Then I get the result 60.0.

  #Scenario: Subtract two numbers
    #Given I have two numbers, 500.0 and 200.0.
    #And I get the text "Subtracting..."
    #And I get the text "Still subtracting..."
    #When I subtract two numbers.
    #Then I get the result 300.0.