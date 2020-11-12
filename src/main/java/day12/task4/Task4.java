package day12.task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("member1_OfGroup1");
        list1.add("member2_OfGroup1");
        list1.add("member3_OfGroup1");
        MusicBand group1 = new MusicBand("group1", 1960, list1);

        List<String> list2 = new ArrayList<>();
        list2.add("member1_OfGroup2");
        list2.add("member2_OfGroup2");
        list2.add("member3_OfGroup2");
        MusicBand group2 = new MusicBand("group2", 1983, list2);

        group1.printMembers();
        group2.printMembers();

        MusicBand.transferMembers(group1, group2);
        System.out.println();
        System.out.println("После переноса из группы 1 в группу 2");

        group1.printMembers();
        group2.printMembers();
    }
}
