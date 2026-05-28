package com.example.hp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmployeeManagerTest {

    @Test
    public void testGetEmployees() {

        EmployeeManager employeeManager = new EmployeeManager();

        Employees employees = employeeManager.getEmployees();

        assertFalse(employees.getEmployeeList().isEmpty());
    }
}