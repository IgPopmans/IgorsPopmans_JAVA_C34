package org.hometask4.student;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class StudentService {

    public int countStudentsAmount(Student[] students, int groupNumber) {

        int count = 0;
        for (Student student : students) {
            if (student.getGroupNumber() == groupNumber){
                count++;
            }
        }
        return count;
    }
}
