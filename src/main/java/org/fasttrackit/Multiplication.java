package org.fasttrackit;

public class Multiplication extends Sum {

    public double numbersForMultiplication(double number1, double number2){

        double multiplicationResult = number1*number2;
        return multiplicationResult;
    }

    public double numbersForMultiplication( double number2){
        double multiplicationResult = number2 * 2;
        return multiplicationResult;
    }
}
