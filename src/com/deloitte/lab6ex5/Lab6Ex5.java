package com.deloitte.lab6ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex5 {

    public static int getSecondSmallest(int[] arr) {
        List<Integer> numberList = new ArrayList<>();
        
        for (int num : arr) {
            numberList.add(num);
        }
        
        Collections.sort(numberList);
        
        return numberList.get(1);
    }

    public static void main(String[] args) {
        int[] sampleArray = {5, 3, 9, 1, 4};
        int secondSmallest = getSecondSmallest(sampleArray);
        
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}
