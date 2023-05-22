package lab3.model;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String patronymicName, Sex sex) {
        super(firstName, lastName, patronymicName, sex);
    }

}