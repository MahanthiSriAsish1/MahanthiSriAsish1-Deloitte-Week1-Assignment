package com.deloitte.lab2ex4;

import java.util.Arrays;
import java.util.Comparator;

public class Lab2Ex4 {

	
	public static int[] modifyArray(int[] arr) {
		return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,5,6,6,6,7,8,8,9};
		int[] result = modifyArray(arr);
		
		System.out.println(Arrays.toString(result));
	}
}
