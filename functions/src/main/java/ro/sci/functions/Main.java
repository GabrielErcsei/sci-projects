package ro.sci.functions;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Calculator calculator = new Calculator();

        System.out.println("suma: " + calculator.aduna(4,5));

        System.out.println("fibonacci: " + calculator.fibonacci(10));

    }



}
