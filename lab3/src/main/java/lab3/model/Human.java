package lab3.model;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private Sex sex;

    public Human(String firstName, String lastName, String patronymicName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.sex = sex;
    }

    public String getName() {
        return firstName;
    }
}