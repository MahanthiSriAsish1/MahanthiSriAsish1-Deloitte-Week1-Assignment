package com.deloitte.lab6ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex7 {

    public static int[] getSorted(int[] arr) {
        List<String> reversedList = new ArrayList<>();
        
        for (int num : arr) {
            String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
            reversedList.add(reversed);
        }
        
        Collections.sort(reversedList);
        
        int[] sortedArray = new int[reversedList.size()];
        for (int i = 0; i < reversedList.size(); i++) {
            sortedArray[i] = Integer.parseInt(reversedList.get(i));
        }
        
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] sampleArray = {123, 456, 789};
        int[] sortedResult = getSorted(sampleArray);
        
        System.out.print("Sorted Array after Reversing: ");
        for (int num : sortedResult) {
            System.out.print(num + " ");
        }
    }
}

