package lab3.controller;

import lab3.model.Group;
import lab3.model.Sex;
import lab3.model.Student;

public class StudentCreator {
    private Group group;



    public Student createStudent(String firstName, String lastName, String middleName, Sex sex) {

        Student student = new Student(firstName, lastName, middleName, sex);

        return student;
    }
}
