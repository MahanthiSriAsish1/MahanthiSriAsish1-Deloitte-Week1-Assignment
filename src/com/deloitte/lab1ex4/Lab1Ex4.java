package com.deloitte.lab1ex4;

import java.util.Scanner;

public class Lab1Ex4 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter Any Number of your choice:");
//		int num = sc.nextInt();
//
//		System.out.println("Prime Numbers upto the entered number:");
//		if (num < 2) {
//			System.out.println(num + " is not a prime number.");
//		} else {
//			for (int i = 2; i < num; i++) {
//				if (num % i != 0) {
//					System.out.println(i);
//				}
//			}
//		}
//
//		sc.close();
//	}
	
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Prime numbers up to " + num + " are:");
        for (int currentNum = 2; currentNum <= num; currentNum++) {
            if (isPrime(currentNum)) {
                System.out.println(currentNum);
            }
        }

        scanner.close();
    }
}
