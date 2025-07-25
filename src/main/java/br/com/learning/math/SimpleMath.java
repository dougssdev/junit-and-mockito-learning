package br.com.learning.math;

public class SimpleMath {

    public Double sum(Double firstNumber, Double secondNumber){
        return firstNumber + secondNumber;
    }

    public Double subtract(Double firstNumber, Double secondNumber){
        return firstNumber - secondNumber;
    }

    public Double multiply(Double firstNumber, Double secondNumber){
        return firstNumber * secondNumber;
    }

    public Double divide(Double firstNumber, Double secondNumber){
        if(secondNumber.equals(0D)) throw new ArithmeticException("Impossible to divide by zero");
        return firstNumber / secondNumber;
    }

    public Double mean (Double firstNumber, Double secondNumber){
        return (firstNumber + secondNumber) / 2;
    }

    public Double squareRoot(Double number){
        return Math.sqrt(number);
    }
}
