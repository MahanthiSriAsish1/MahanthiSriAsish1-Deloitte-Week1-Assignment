package com.deloitte.lab2ex2;

import java.util.Arrays;

public class Lab2Ex2 {

    public static String[] modifyArray(String[] arr) {
    	Arrays.sort(arr);
        int length = arr.length;
        int mid = (length + 1) / 2;

        for (int i = 0; i < mid; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        for (int i = mid; i < length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = {"hello", "world", "i am", "asish"};

        String[] modifiedArray = modifyArray(arr);

        System.out.println(Arrays.toString(modifiedArray));
    }
}
