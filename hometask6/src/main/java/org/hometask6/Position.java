package org.hometask6;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public enum Position {

    MANAGER("Manager",3000),
    ENGINEER("Engineer",5000);

    private final String title;
    private final int salary;

    Position(String title, int salary) {
        this.title = title;
        this.salary = salary;
    }


    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }
}

