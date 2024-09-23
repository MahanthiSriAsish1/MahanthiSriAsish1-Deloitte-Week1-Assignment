package com.deloitte.lab1ex1;

import java.util.Scanner;

public class Lab1Ex1 {
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A number Your Like:");
		int num = sc.nextInt();
		
		String str = Integer.toString(num);
		
		sc.close();
		
		for (char ch: str.toCharArray()) {
			int digit = Character.getNumericValue(ch);
			
			sum  += Math.pow(digit, 3);
		}
		
		System.out.println("Sum of cubes of the Digits:" + sum);
	}
}
