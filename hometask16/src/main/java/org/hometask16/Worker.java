package org.hometask16;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Worker {

   private int salary;

    public Worker(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                '}';
    }
}
