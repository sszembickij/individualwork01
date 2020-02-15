/*2. Взаимная зависимость.
Есть класс Student у которого есть имя и группу, и класс Group с
полями имя и List<Student>.
- Реализовать у класса Student метод setGroup(Group).
Когда у студента прописывают группу он добавляется в соотв. группу.
Если у студента задают группу null или заменяют группу то в
группе должныпроизойти соотв. изменения.
- Реализовать у класса Group методы addStudent(Student)/removeStudent(Student).
При добавлении в группу у прописывается эта группа и при сдалении удаляется.
- Реализовать метод toString() у классов.*/

package task02;

public class Main {
    public static void main(String[] args) {
        Group group214 = new Group("214");
        Group group215 = new Group("215");
        Student petrov = new Student("Петров");
        Student sidorov = new Student("Сидоров");
        Student ivanov = new Student("Иванов");

        System.out.println("=== sidorov.setGroup(group214)");
        sidorov.setGroup(group214);
        System.out.println(sidorov.toString());
        System.out.println(group214.toString());

        System.out.println("=== ivanov.setGroup(group214)");
        ivanov.setGroup(group214);
        System.out.println(group214.toString());

        System.out.println("=== sidorov.setGroup(group215)");
        sidorov.setGroup(group215);
        System.out.println(sidorov.toString());
        System.out.println(group214.toString());
        System.out.println(group215.toString());

        System.out.println("=== ivanov.setGroup(null)");
        ivanov.setGroup(null);
        System.out.println(ivanov.toString());
        System.out.println(group214.toString());
        System.out.println(group215.toString());

        System.out.println("=== group215.addStudent(petrov)");
        group215.addStudent(petrov);
        System.out.println(petrov.toString());
        System.out.println(group214.toString());
        System.out.println(group215.toString());

        System.out.println("=== group215.removeStudent(petrov)");
        group215.removeStudent(petrov);
        System.out.println(petrov.toString());
        System.out.println(group214.toString());
        System.out.println(group215.toString());
    }

}
