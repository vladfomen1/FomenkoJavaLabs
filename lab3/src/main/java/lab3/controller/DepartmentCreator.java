package lab3.controller;

import lab3.model.Department;
import lab3.model.Group;


public class DepartmentCreator {
    public Department createDepartment(String name, Group group) {
        return new Department(name, group);
    }
}


