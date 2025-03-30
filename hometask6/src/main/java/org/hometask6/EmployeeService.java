package org.hometask6;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class EmployeeService {

    public void printSalary(Employee employee) {
        System.out.println("Employee salary : " + employee + " salary  with %  = " + employee.countSalary());
    }
}
