package com.deloitte.lab3ex8;

public class Lab3Ex8 {

	public static boolean isPositiveString(String str) {
		str = str.toUpperCase();

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) > str.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String input1 = "ANT";
		String input2 = "HELLO";
		String input3 = "ACE";

		System.out.println("Is '" + input1 + "' a positive string? " + isPositiveString(input1));
		System.out.println("Is '" + input2 + "' a positive string? " + isPositiveString(input2));
		System.out.println("Is '" + input3 + "' a positive string? " + isPositiveString(input3));
	}
}
