package com.deloitte.lab6ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

    public static Map<String, String> getStudents(HashMap<String, Integer> marksMap) {
        Map<String, String> medalMap = new HashMap<>();
        
        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            String regNo = entry.getKey();
            int marks = entry.getValue();
            
            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } else if (marks >= 80) {
                medalMap.put(regNo, "Silver");
            } else if (marks >= 70) {
                medalMap.put(regNo, "Bronze");
            }
        }
        
        return medalMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("R001", 95);
        studentMarks.put("R002", 85);
        studentMarks.put("R003", 75);
        studentMarks.put("R004", 90);
        studentMarks.put("R005", 65);
        
        Map<String, String> eligibleStudents = getStudents(studentMarks);
        
        System.out.println("Students and their Medals: " + eligibleStudents);
    }
}
