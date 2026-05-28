package com.example.hp;

import java.util.ArrayList;

public class EmployeeManager {

    private static Employees employees = new Employees();

    static {

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(
                new Employee(
                        1,
                        "Joel",
                        "Blesson",
                        "joel@gmail.com",
                        "Developer"
                )
        );

        employeeList.add(
                new Employee(
                        2,
                        "Alex",
                        "Johnson",
                        "alex@gmail.com",
                        "Manager"
                )
        );

        employees.setEmployeeList(employeeList);
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}