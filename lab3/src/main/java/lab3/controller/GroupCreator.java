package lab3.controller;

import lab3.model.Student;
import lab3.model.Group;

public class GroupCreator {
    public Group createGroup(String name, Student student) {
        return new Group(name, student);
    }
}

