package org.fasttrackit;


public class App
{
    public static void main( String[] args )
    {


        Calc mathOperation = new Calc();

//
//
//double secondOperation = mathOperation.numbersForMultiplication(2434.5,234.8);
//
//        System.out.println(secondOperation);
//
//
//      double thirdOperation = mathOperation.numbersForDivision(185984.5, 234.5);
//
//        System.out.println(thirdOperation);
//
////     fourth Operation
//
//       System.out.println(mathOperation.numbersForDecrease(15.21, 16.8));

        //Overloaded method for decrease number

        double operation1 = mathOperation.numbersForDecrease(90);
       //System.out.println(operation1);

        System.out.println(mathOperation.numbersForDecrease(5,4));

        //Overloaded method for sum number

       double operation2 = mathOperation.numbersForSum(12);
//        System.out.println(operation2);
//
      System.out.println(mathOperation.numbersForSum(10,12));

        //Overloaded method for division number

        double operation3 = mathOperation.numbersForDivision(25.1);
        System.out.println(operation3);

        double operation4 = mathOperation.numbersForDivision(35.5, 5);
        System.out.println(operation4);

        //Overloaded method for multiplication number

        double operation5 = mathOperation.numbersForMultiplication(5.5);
        System.out.println(operation5);


        double operation6 = mathOperation.numbersForMultiplication(5);
        System.out.println(operation6);





    }
}

