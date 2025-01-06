package common;

public class Calculator
{
    private double firstNumber;
    private double secondNumber;
    private double result;

    public Calculator(double firstNumber, double secondNumber)
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void add()
    {
        result = firstNumber + secondNumber;
    }

    public double getResult()
    {
        return result;
    }

    public void subtract()
    {
        result = firstNumber - secondNumber;
    }

    public void multiply()
    {
        result = firstNumber * secondNumber;
    }

    public void divide()
    {
        result = firstNumber / secondNumber;
    }
}
