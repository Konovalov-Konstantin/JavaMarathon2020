package day9.Task1;

public class Student extends Human {
    String group;

    public String getGroup() {
        return group;
    }

    public Student (String name, String group) {
        super(name);
        this.group = group;
    }
    public void printInfo () {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}
