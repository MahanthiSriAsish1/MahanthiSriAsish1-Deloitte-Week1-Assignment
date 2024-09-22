package com.deloitte.lab4ex2.cg.eis.service;

import com.deloitte.lab4ex2.cg.eis.bean.Employee;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Employee getEmployeeDetails() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();  
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        return new Employee(id, name, salary, designation);
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
    }
}
