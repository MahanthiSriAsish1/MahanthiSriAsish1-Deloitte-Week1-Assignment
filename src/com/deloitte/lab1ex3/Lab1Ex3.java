package com.deloitte.lab1ex3;

import java.util.Scanner;

public class Lab1Ex3 {
	public static int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static int fibonacciIterative(int n) {
		if (n <= 1) {
			return n;
		}
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the nth Number:");
		int n = sc.nextInt();
		
		int fibRec = fibonacciRecursive(n);
		System.out.println("Fibonacci number (recursive) for n = " + n + " is: " + fibRec);

		int fibIter = fibonacciIterative(n);
		System.out.println("Fibonacci number (iterative) for n = " + n + " is: " + fibIter);
		
		sc.close();
	}
}
