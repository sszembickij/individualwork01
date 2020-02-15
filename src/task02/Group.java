package task02;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        student.setGroupByGroup(this);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
        student.setGroupByGroup(null);

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Группа " + name + '\n');
        for (int i = 0; i <students.size() ; i++) {
            string.append(students.get(i).getName());
            string.append('\n');
        }
        return string.toString();
    }
}
