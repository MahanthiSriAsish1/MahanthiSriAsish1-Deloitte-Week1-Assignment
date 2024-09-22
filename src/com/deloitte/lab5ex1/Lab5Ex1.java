package com.deloitte.lab5ex1;

import com.deloitte.lab5ex1.cg.eis.exception.AgeException;

import java.util.Scanner;

public class Lab5Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    private static void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException("Age must be above 15.");
        }
    }
}
