package com.deloitte.lab6ex1;

import java.util.*;

public class Lab6Ex1 {

    public static List<Integer> getSortedValues(HashMap<String, Integer> map) {
        Collection<Integer> values = map.values();
        List<Integer> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Alice", 25);
        sampleMap.put("Bob", 30);
        sampleMap.put("Charlie", 20);
        
        List<Integer> sortedValues = getSortedValues(sampleMap);
        System.out.println("Sorted Values: " + sortedValues);
    }
}
