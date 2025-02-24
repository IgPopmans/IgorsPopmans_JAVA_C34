package org.hometask4.student;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        //3) Необходимо создать объект Student со следующими полями
        //
        //a) имя студента
        //
        //b) возраст студента
        //
        //с) номер группы
        //
        //Создать StudentService класс, с методом который принимает массив студентов и номер группы. Данный метод должен вернуть количество студентов, которые относятся к данной группе.


        Student[] students = {
                new Student("Jack", 32, 1),
                new Student("Sam", 45, 4),
                new Student("Maria", 35, 2),
                new Student("Peter", 23, 1)};

        StudentService studentService = new StudentService();

        System.out.println("Students amount in a group 1: " + studentService.countStudentsAmount(students, 1));
    }
}
