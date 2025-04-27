package org.hometask18;

import java.math.BigDecimal;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Employee {

    private Profession profession;
    private BigDecimal salary;


    public Profession getProfession() {
        return profession;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "profession=" + profession +
                ", salary=" + salary +
                '}';
    }

    public Employee(Profession profession, BigDecimal salary) {
        this.profession = profession;
        this.salary = salary;
    }
}
