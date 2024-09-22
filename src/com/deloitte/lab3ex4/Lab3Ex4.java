package com.deloitte.lab3ex4;

public class Lab3Ex4 {
	public static int modifyNumber(int number) {
        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < numStr.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(numStr.charAt(i));
            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));
            int diff = Math.abs(currentDigit - nextDigit);
            result.append(diff);
        }
        
        result.append(numStr.charAt(numStr.length() - 1));
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        int input = 45862;
        int output = modifyNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

}
