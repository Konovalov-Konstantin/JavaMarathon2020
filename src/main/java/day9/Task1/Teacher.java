package day9.Task1;

public class Teacher extends Human {
    private String object;

    public String getObject() {
        return object;
    }
    public Teacher (String name, String object) {
        super(name);
        this.object = object;
    }
    public void printInfo () {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
