package com.deloitte.lab6ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

    public static List<String> votersList(Map<String, Integer> people) {
        List<String> eligibleVoters = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String id = entry.getKey();
            int age = entry.getValue();
            
            if (age > 18) {
                eligibleVoters.add(id);
            }
        }
        
        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<String, Integer> people = Map.of(
            "ID001", 20,
            "ID002", 17,
            "ID003", 19,
            "ID004", 15,
            "ID005", 22
        );

        List<String> eligibleVoters = votersList(people);
        System.out.println("Eligible Voters: " + eligibleVoters);
    }
}
