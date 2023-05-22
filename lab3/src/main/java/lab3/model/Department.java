package lab3.model;

public class Department {
    private String name;
    private Group group;



    public Department(String name, Group group) {
        this.name = name;
        this.group = group;
    }


    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }
}