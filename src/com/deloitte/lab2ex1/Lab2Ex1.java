package com.deloitte.lab2ex1;

import java.util.Arrays;

public class Lab2Ex1 {
	public static int getSecondSmallest() {

		int[] arr = { -1, -150 ,1, 2, 4, 8, 2, 48, 168 };

		Arrays.sort(arr);

		return arr[1];

	}
	public static void main(String[] args) {
		System.out.println(getSecondSmallest());
	}
}
