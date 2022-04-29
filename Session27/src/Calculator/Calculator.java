package Calculator;

public class Calculator {

    private boolean action = false;
    private double prevNumber = 0;
    private double currentNumber = 0;
    private char operator;
    private double result = 0;

    public double getCurrentNumber() {
        return currentNumber;
    }
    public double getPrevNumber() {
        return prevNumber;
    }
    public char getOperator() {
        return operator;
    }
    public double getResult() {
        if (operator == '+')
        {
            add();
        }
        else if (operator == '-')
        {
            subtract();
        }
        else if (operator == '/')
        {
            divide();
        }
        else if (operator == '*')
        {
            multiply();
        }
        return result;
    }

    public void setActionTrue() {
        action = true;
    }
    public void setActionFalse()
    {
        action = false;
    }
    public boolean getAction()
    {
        return action;
    }
    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }
    public void setPrevNumber(double prevNumber) {
        this.prevNumber = prevNumber;
    }
    public void setResult(double result) {
        this.result = result;
    }

    public double multiply()
    {
        setResult(prevNumber * currentNumber);
        return result;
    }
    public double divide()
    {
        setResult(prevNumber / currentNumber);
        return result;
    }
    public double add()
    {
        setResult(prevNumber + currentNumber);
        return result;
    }
    public double subtract()
    {
        setResult(prevNumber - currentNumber);
        return result;
    }


}
