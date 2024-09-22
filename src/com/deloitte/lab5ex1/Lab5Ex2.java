package com.deloitte.lab5ex1;

import  com.deloitte.lab5ex1.cg.eis.exception.NameException;

import java.util.Scanner;

public class Lab5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        try {
            validateName(firstName, lastName);
            System.out.println("Full name is valid.");
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    private static void validateName(String firstName, String lastName) throws NameException {
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new NameException("First name and last name cannot be blank.");
        }
    }
}
