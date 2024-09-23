package com.deloitte.lab1ex2;

import java.util.Scanner;

public class Lab1Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select from the Three Options:");
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. Yellow");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println("STOP");
		}
		case 2: {
			System.out.println("Ready");
		}
		case 3: {
			System.out.println("Go");
		}
		default:
			;
		}
		sc.close();
	}
}
