package day12.task4;

import java.util.*;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(this.getMembers());
    }

    public static void transferMembers(MusicBand a1, MusicBand a2) {
        for (String member : a1.getMembers())
            a2.getMembers().add(member);
        a1.getMembers().clear();
    }
}

