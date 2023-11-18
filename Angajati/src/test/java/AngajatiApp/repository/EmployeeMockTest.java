package AngajatiApp.repository;

import org.junit.jupiter.api.Test;
import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMockTest {
    private EmployeeMock employeeMock = new EmployeeMock();

    @Test
    void TC01_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, -2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertFalse(result);
    }

    @Test
    void TC02_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, 0d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertFalse(result);
    }

    @Test
    void TC03_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, 0.01d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertTrue(result);
    }

    @Test
    void TC04_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, 2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertTrue(result);
    }

    @Test
    void TC05_addEmployee() {
        Employee testEmployee = new Employee("J", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, 2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertFalse(result);
    }

    @Test
    void TC06_addEmployee() {
        Employee testEmployee = new Employee("Jo", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, 2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertFalse(result);
    }

    @Test
    void TC07_addEmployee() {
        Employee testEmployee = new Employee("Joh", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, 2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertTrue(result);
    }

    @Test
    void TC08_addEmployee() {
        Employee testEmployee = new Employee("John", "D", "1234567890123",
                DidacticFunction.ASISTENT, 2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertFalse(result);
    }

    @Test
    void TC09_addEmployee() {
        Employee testEmployee = new Employee("John", "Do", "1234567890123",
                DidacticFunction.ASISTENT, 2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertFalse(result);
    }
    @Test
    void TC10_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.ASISTENT, 2500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertTrue(result);
    }

    @Test
    void TC11_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.LECTURER, 3500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertTrue(result);
    }

    @Test
    void TC12_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.TEACHER, 4500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertTrue(result);
    }

    @Test
    void TC13_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.CONFERENTIAR, 5500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertTrue(result);
    }

    @Test
    void TC14_addEmployee() {
        boolean result = false;
        try {
            Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                    DidacticFunction.valueOf("RECTOR"), 5500d);
            result = employeeMock.addEmployee(testEmployee);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        } finally {
            assertFalse(result);
        }
    }

    @Test
    void TC15_addEmployee() {
        Employee testEmployee = new Employee("John", "Doe", "1234567890123",
                DidacticFunction.LECTURER, -3500d);
        boolean result = employeeMock.addEmployee(testEmployee);
        assertFalse(result);
    }


}