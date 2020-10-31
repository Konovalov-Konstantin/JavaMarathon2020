package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    void evaluate(Student s) {
        Random random = new Random();
        int estimation = random.nextInt(4) + 2;

        String estimationString = "";

        switch (estimation) {
            case 2:
                estimationString = "неудовлетворительно";
                break;
            case 3:
                estimationString = "удовлетворительно";
                break;
            case 4:
                estimationString = "хорошо";
                break;
            case 5:
                estimationString = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента " + s.getName() + " по предмету " + "\n"
                + this.subject + " на оценку " + estimationString);
    }

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Konovalov");
        Teacher t1 = new Teacher("Neil_Alishev", "JAVA_MARAPHON");
        t1.evaluate(s1);
    }
}
