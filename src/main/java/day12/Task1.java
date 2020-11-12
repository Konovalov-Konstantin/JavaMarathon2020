package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Opel");
        list.add("Mazda");
        list.add("Porshe");
        System.out.println(list);
        list.add(3,"Bugatti");
        list.remove(0);
        System.out.println(list);
    }
}
