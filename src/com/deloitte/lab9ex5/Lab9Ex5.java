package com.deloitte.lab9ex5;

import java.util.function.IntUnaryOperator;

public class Lab9Ex5 {

    public static void main(String[] args) {
        IntUnaryOperator factorialCalculator = Lab9Ex5::factorial;

        int number = 5;
        int result = factorialCalculator.applyAsInt(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
