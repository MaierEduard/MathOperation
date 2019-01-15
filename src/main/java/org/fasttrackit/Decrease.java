package org.fasttrackit;

public class Decrease extends Division {


    public  double numbersForDecrease( double number1, double number2){
        double decreaseResult = number1-number2;
        System.out.println("number " + number1 +" - " +" number " + number2 + " = " + decreaseResult);
        return decreaseResult;}


    public  double numbersForDecrease( double number1){
        double decreaseResult = number1 - 4;
        System.out.println("number " + number1 +" - " +" number 4 " + " = " + decreaseResult);
        return decreaseResult;
    }



}
