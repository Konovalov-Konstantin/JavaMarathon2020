package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tim", "1557");
        Teacher teacher = new Teacher("Mike", "Biology");
        System.out.println(student.getGroup());
        System.out.println(teacher.getObject());
        student.printInfo();
        teacher.printInfo();
    }
}
