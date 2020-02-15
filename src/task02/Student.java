package task02;

public class Student {
    private String name;
    private Group group;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setGroup(Group group) {
        if (this.group != null) {
            this.group.removeStudent(this);
        }
        this.group = group;
        if (group!=null){
            this.group.addStudent(this);
        }
    }

    public void setGroupByGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Студент " + name + ", гр. " + (group == null ? "-" : group.getName());
    }
}
