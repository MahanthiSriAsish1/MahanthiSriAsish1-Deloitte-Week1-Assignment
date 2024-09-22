package com.deloitte.lab6ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : arr) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        return charCountMap;
    }

    public static void main(String[] args) {
        char[] sampleArray = {'a', 'b', 'c', 'a', 'b', 'a'};
        Map<Character, Integer> result = countChars(sampleArray);
        
        System.out.println("Character Count: " + result);
    }
}
