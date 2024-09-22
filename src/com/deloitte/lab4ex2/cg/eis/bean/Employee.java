package com.deloitte.lab4ex2.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = findInsuranceScheme(salary, designation);
    }

    private String findInsuranceScheme(double salary, String designation) {
        if (salary < 30000) {
            return "No Insurance";
        } else if (salary <= 60000) {
            return "Scheme A";
        } else {
            return "Scheme B";
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }
}
