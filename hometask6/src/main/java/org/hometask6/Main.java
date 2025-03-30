package org.hometask6;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Sam", 10, Position.MANAGER);
        Employee employee2 = new Employee("Jane", 21, Position.ENGINEER);

        EmployeeService employeeService = new EmployeeService();

        employeeService.printSalary(employee1);
        employeeService.printSalary(employee2);
    }
}