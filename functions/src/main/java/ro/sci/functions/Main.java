package ro.sci.functions;

import ro.sci.functions.math.Calculator;
import ro.sci.functions.tema1.ArithmeticCalculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Calculator calculator = new Calculator();

        System.out.println("suma: " + calculator.aduna(4,5));

        System.out.println("fibonacci: " + calculator.fibonacci(10));

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        System.out.println(arithmeticCalculator.subtract(1,5));

        System.out.println(arithmeticCalculator.multiply(4,5));

        System.out.println(arithmeticCalculator.multiply(0,5));

        System.out.println(arithmeticCalculator.divide(40,5));

        System.out.println(arithmeticCalculator.divide(0,5));

        System.out.println(arithmeticCalculator.divide(-7,5));

        System.out.println(arithmeticCalculator.daysInMonthCalculator(2));
        System.out.println(arithmeticCalculator.daysInMonthCalculator(13));
        System.out.println(arithmeticCalculator.daysInMonthCalculator(11));





    }



}
