package com.deloitte.lab1ex7;

import java.util.Scanner;

public class Lab1Ex7 {
	public static int sumOfSquares(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += Math.pow(i, 2);
		}
		
		return sum;
	}
	
	public static int squareOfSum(int n) {
		int sum = n * (n+1)/2;
		return (int) Math.pow(sum,2);
	}
	
	public static int calculateDifference(int sumofSqaures,int squareofSum ) {
		return (sumofSqaures - squareofSum);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the count of natural numbers:");
		int n = sc.nextInt();
		
		int sumofSqaures = sumOfSquares(n);
		int squareofSum = squareOfSum(n);
		
		System.out.println(calculateDifference(sumofSqaures,squareofSum));
	}
}
