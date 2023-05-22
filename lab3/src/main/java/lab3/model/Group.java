package lab3.model;


public class Group {
    private String name;
    private Student student;

    public Group(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}