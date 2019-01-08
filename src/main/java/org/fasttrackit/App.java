package org.fasttrackit;


public class App
{
    public static void main( String[] args )
    {


        Calc mathOperation = new Calc();

double firstOperation = mathOperation.numbersForSum(43.3, 46.1);

        System.out.println(firstOperation);


double secondOperation = mathOperation.numbersForMultiplication(2434.5,234.8);

        System.out.println(secondOperation);


        double thirdOperation = mathOperation.numbersForDivision(185984.5, 234.5);

        System.out.println(thirdOperation);

//     fourth Operation

        System.out.println(mathOperation.numbersForDecrease(15.2, 16.8));




    }
}
