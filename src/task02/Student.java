package task02;

public class Student {
    private String name;
    private Group group;

    Student(String name) {
        this.name = name;
    }

    public Student(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    String getName() {
        return name;
    }

    void setGroup(Group group) {
        if (this.group != null) {
            this.group.removeStudent(this);
        }
        this.group = group;
        if (group!=null){
            this.group.addStudent(this);
        }
    }

    void setGroupByGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Студент " + name + ", гр. " + (group == null ? "-" : group.getName());
    }
}
