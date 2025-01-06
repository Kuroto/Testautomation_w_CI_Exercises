package stepDefinitions;

import common.Calculator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MyStepdefs
{
    private Calculator calculator;

    /*@Before
    public void setup()
    {
        System.out.println("Performing setup with @Before.");
    }*/

    @Given("I have two numbers, {} and {}")
    public void iHaveTwoNumbers(double firstNumber, double secondNumber)
    {
        calculator = new Calculator(firstNumber, secondNumber);
        System.out.println("I have two numbers: " + firstNumber + " and " + secondNumber);
    }

    @When("I add two numbers.")
    public void iAddTheTwoNumbers()
    {
        calculator.add();

        System.out.println("Adding numbers.");
    }

    @Then("I get the result {double}.")
    public void iGetTheResult(double expected)
    {
        double actual = calculator.getResult();

        assertEquals(expected, actual, 0.001);
        System.out.println("Getting the result... expected is " + expected + ". The actual is : " + actual);
    }

    @When("I subtract two numbers.")
    public void iSubtractTwoNumbers()
    {
        calculator.subtract();

        //System.out.println("Subtracting the numbers.");
    }

    @When("I multiply two numbers.")
    public void iMultiplyTwoNumbers()
    {
        calculator.multiply();

        //System.out.println("Subtracting the numbers.");
    }

    @When("I divide two numbers.")
    public void iDivideTwoNumbers()
    {
        calculator.divide();

        //System.out.println("Subtracting the numbers.");
    }

    @Given("the test case start with this")
    public void theTestCaseStartWithThis()
    {
        System.out.println("Test case starts.");
    }

    @And("then something else happens")
    public void thenSomethingElseHappens()
    {
        System.out.println("Something else happens.");
    }

    @And("I get the text {string}")
    public void iGetSomeTheText(String text)
    {
        System.out.println(text);
    }

    @After
    public void tearDown()
    {
        System.out.println("End of test case with @After.");
        System.out.println("");
        System.out.println("------");
        System.out.println("");
    }
}
