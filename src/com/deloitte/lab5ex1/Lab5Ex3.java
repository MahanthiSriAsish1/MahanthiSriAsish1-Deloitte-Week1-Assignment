package com.deloitte.lab5ex1;

import  com.deloitte.lab5ex1.cg.eis.exception.EmployeeException;

import java.util.Scanner;

public class Lab5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        try {
            validateSalary(salary);
            System.out.println("Salary is valid.");
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    private static void validateSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least 3000.");
        }
    }
}
