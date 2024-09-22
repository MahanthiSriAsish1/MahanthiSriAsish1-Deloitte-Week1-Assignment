package com.deloitte.lab3ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {
	public static int strToken(String str){
		return Integer.valueOf(str);  
	};

	public static void main(String[] args) {

		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integers in a Single Line:");
		String str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str);
		

		while (st.hasMoreTokens()) {
			 String token = st.nextToken();
			int num = (int)strToken(token);
			System.out.println(token);
			sum += num;
		}
		System.out.println("Sum of the Integers:" + " " + sum);
		
		sc.close();
	}
}
