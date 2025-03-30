package org.hometask6;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Employee {

    private String name;
    private int workExperience;
    Position position;


    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public Position getPosition() {
        return position;
    }

    public Employee(String name, int workExperience, Position position) {
        this.name = name;
        this.workExperience = workExperience;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee : " + name + ", workExperience: " + workExperience + " years, " + "Position: " + position.getTitle() + ", Salary: " + position.getSalary() + " usd.";

    }

    public double countSalary() {
        return position.getSalary() + (getWorkExperience() * 1000);
    }
}
