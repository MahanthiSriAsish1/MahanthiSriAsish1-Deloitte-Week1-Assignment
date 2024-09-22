package com.deloitte.lab9ex2;

import java.util.function.Function;

public class Lab9Ex2 {

    public static void main(String[] args) {
        String input = "CGXUAKJFDA";
        String formattedString = formatString(input);
        System.out.println("Formatted String: " + formattedString);
    }

    public static String formatString(String str) {
        Function<String, String> insertSpaces = s -> String.join(" ", s.split(""));
        return insertSpaces.apply(str);
    }
}
