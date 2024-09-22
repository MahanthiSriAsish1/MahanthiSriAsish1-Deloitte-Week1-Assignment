package com.deloitte.lab1ex6;

import java.util.Scanner;

public class Lab1Ex6 {
	public static boolean checkNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number of your choice:");
		int num = sc.nextInt();

		String str = Integer.toString(num);

		char[] ch = str.toCharArray();

		for (int i = 1; i < ch.length; i++) {
            if (Character.getNumericValue(ch[i]) < Character.getNumericValue(ch[i - 1])) {
                sc.close();
                return false;
            }
        }

        sc.close();
        return true;
	}

	public static void main(String[] args) {
		System.out.println(checkNumber());
	}
}
