package lab3.controller;

import lab3.model.*;


public class UniversityCreator {
    public University createTypicalUniversity() {
        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        Student student1 = studentCreator.createStudent("Vladisalv", "Fomenko", "Oleksandrovich", Sex.MALE);
        Group group = groupCreator.createGroup("121-20-2", student1);
        Department department = departmentCreator.createDepartment("PZKS", group);
        Faculty faculty = facultyCreator.createFaculty("FIT", department);
        University university = new University("NMU", faculty);

        return university;
    }
}
