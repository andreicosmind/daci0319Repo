package AngajatiApp.repository;

import org.junit.jupiter.api.Test;
import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class modifyEmployeeFunctionTest {
    private EmployeeMock employeeMock = new EmployeeMock();

    @Test
    void TC01_modifyEmployeeFunction() {
        assertThrows(NullPointerException.class, () ->
                employeeMock.modifyEmployeeFunction(null, DidacticFunction.CONFERENTIAR));
    }

    @Test
    void TC02_modifyEmployeeFunction() {
        Employee testEmployee = employeeMock.getEmployeeList().get(1);
        employeeMock.modifyEmployeeFunction(testEmployee, DidacticFunction.TEACHER);
        assertEquals("TEACHER", testEmployee.getFunction().toString());
    }

    @Test
    void TC03_modifyEmployeeFunction() {
        Employee testEmployee = employeeMock.getEmployeeList().get(employeeMock.getEmployeeList().size()-1);
        employeeMock.modifyEmployeeFunction(testEmployee, DidacticFunction.CONFERENTIAR);
        assertEquals("CONFERENTIAR", testEmployee.getFunction().toString());
    }
}
