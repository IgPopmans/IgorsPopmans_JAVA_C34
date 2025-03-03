package org.hometask6;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class EmployeeNew extends Employee {


    public EmployeeNew(String name, int workExperience, Position position) {
        super(name, workExperience, position);
    }

    @Override
    public double countSalary() {
        int baseSalary = getPosition().getSalary();
        int salary = baseSalary + (getWorkExperience() * 1000);
        return salary * 1.2;
    }
}
