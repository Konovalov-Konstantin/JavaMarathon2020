package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }


    public void printMembers() {
        System.out.println(this.members);
    }

    public static void transferMembers(MusicBand a1, MusicBand a2) {
        for (MusicArtist member : a1.getMembers())
            a2.getMembers().add(member);
        a1.getMembers().clear();
    }
}

class MusicArtist {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "name " + name + "age = " + age;
    }
}

