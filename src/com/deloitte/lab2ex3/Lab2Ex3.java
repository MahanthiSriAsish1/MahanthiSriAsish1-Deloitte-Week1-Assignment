package com.deloitte.lab2ex3;

import java.util.Arrays;
import java.util.function.Function;


public class Lab2Ex3{
	public static Function<Integer, Integer> reverseNumber = num -> {
			String reverse = new StringBuilder(String.valueOf(num)).reverse().toString();
			return Integer.parseInt(reverse);
	};
	public static int[] getSorted(int[] arr) {
		int[] result = Arrays.stream(arr).map(reverseNumber::apply).sorted().toArray();
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,3165,131,5128,335,56};
			int[] result = getSorted(arr);
	        System.out.println(Arrays.toString(result));	
	}
}