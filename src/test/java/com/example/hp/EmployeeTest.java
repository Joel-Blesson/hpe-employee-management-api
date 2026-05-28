package com.example.hp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testEmployeeConstructor() {

        Employee employee = new Employee(
                1,
                "Joel",
                "Blesson",
                "joel@gmail.com",
                "Developer"
        );

        assertEquals(1, employee.getEmployee_id());
        assertEquals("Joel", employee.getFirst_name());
        assertEquals("Blesson", employee.getLast_name());
        assertEquals("joel@gmail.com", employee.getEmail());
        assertEquals("Developer", employee.getTitle());
    }
}