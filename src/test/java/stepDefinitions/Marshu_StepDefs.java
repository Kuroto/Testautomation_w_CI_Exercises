package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Marshu_StepDefs
{
    private WebDriver driver;

    /*@Before
    public void setUp()
    {
        System.out.println("Before stuff...");
    }*/

    @Given("I use {string} as browser")
    public void iUseAsBrowser(String browser)
    {
        if (browser.equals("Edge"))
        {
            driver = new EdgeDriver();
            driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
        }

        else if (browser.equals("Chrome"))
        {
            driver = new ChromeDriver();
            driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
        }

        else if (browser.equals("Firefox"))
        {
            driver = new FirefoxDriver();
            driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
        }
    }

    /*@Given("I log in to the website {string}")
    public void iLogInToTheWebsite(String website)
    {
        driver.get(website);
    }*/

    @Given("there is a first number {int}")
    public void thereIsAFirstNumber(int firstNumber)
    {
        WebElement firstField = driver.findElement(By.name("n01"));
        firstField.click();
        firstField.sendKeys(Integer.toString(firstNumber));
    }

    @And("there is a second number {int}")
    public void thereIsASecondNumber(int secondNumber)
    {
        WebElement secondField = driver.findElement(By.name("n02"));
        secondField.click();
        secondField.sendKeys(Integer.toString(secondNumber));
    }

    @When("calculating the result")
    public void addingTwoNumbers()
    {
        WebElement wait = (new WebDriverWait(driver, Duration));
        driver.findElement(By.cssSelector("[value='Find Addition']")).click();
    }

    @Then("the I should get the result {int}")
    public void theIShouldGetTheResult(int expected)
    {
        WebElement answer = driver.findElement(By.name("answer"));

        String actual = answer.getAttribute("value");

        assertEquals(Integer.toString(expected), actual);
    }
}
