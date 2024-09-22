package com.deloitte.lab4ex2.cg.eis.pl;

import com.deloitte.lab4ex2.cg.eis.bean.Employee;
import com.deloitte.lab4ex2.cg.eis.service.EmployeeService;
import com.deloitte.lab4ex2.cg.eis.service.EmployeeServiceImpl;

public class EmployeeInsuranceSystem {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = employeeService.getEmployeeDetails();
        employeeService.displayEmployeeDetails(employee);
    }
}
