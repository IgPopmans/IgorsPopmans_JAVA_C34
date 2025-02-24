package org.hometask4.student;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Student {

    private String name;
    private int age;
    private int groupNumber;

    public Student(String name, int age, int groupNumber) {
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
