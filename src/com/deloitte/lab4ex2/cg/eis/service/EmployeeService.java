package com.deloitte.lab4ex2.cg.eis.service;

import com.deloitte.lab4ex2.cg.eis.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    void displayEmployeeDetails(Employee employee);
}
