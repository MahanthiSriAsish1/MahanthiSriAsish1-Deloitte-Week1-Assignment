package com.deloitte.lab9ex1;

import java.util.function.BiFunction;

public class Lab9Ex1 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;

        int result = multiply.apply(5, 3);
        System.out.println("The product of 5 and 3 is: " + result);
    }
}
