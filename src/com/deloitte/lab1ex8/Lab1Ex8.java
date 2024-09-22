package com.deloitte.lab1ex8;

import java.util.Scanner;

public class Lab1Ex8 {
	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number of your choice:");
		int n = sc.nextInt();

		boolean result = isPowerOfTwo(n);
		
		System.out.println(result);
		sc.close();
	}
}
