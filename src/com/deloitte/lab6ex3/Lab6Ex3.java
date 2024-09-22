package com.deloitte.lab6ex3;

import java.util.HashMap;
import java.util.Map;

public class  Lab6Ex3 {

    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squareMap = new HashMap<>();
        
        for (int number : numbers) {
            squareMap.put(number, number * number);
        }
        
        return squareMap;
    }

    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 3, 4, 5};
        Map<Integer, Integer> result = getSquares(sampleArray);
        
        System.out.println("Number and Squares: " + result);
    }
}
