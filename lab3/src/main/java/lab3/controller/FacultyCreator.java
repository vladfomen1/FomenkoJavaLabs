package lab3.controller;

import lab3.model.Department;
import lab3.model.Faculty;

public class FacultyCreator {
    public Faculty createFaculty(String name, Department department) {
        // Создаем факультет и присваиваем ему указанное название
        return new Faculty(name, department);
    }
}