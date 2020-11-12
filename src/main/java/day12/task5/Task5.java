package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> list1 = new ArrayList<>();
        list1.add(new MusicArtist("artist1_OfGroup1", 35));
        list1.add(new MusicArtist("artist2_OfGroup1", 36));
        MusicBand group1 = new MusicBand("group1",1965,list1);


        List<MusicArtist> list2 = new ArrayList<>();
        list2.add(new MusicArtist("artist1_OfGroup2", 43));
        list2.add(new MusicArtist("artist2_OfGroup2", 44));
        MusicBand group2 = new MusicBand("group2",1973,list2);

        group1.printMembers();
        group2.printMembers();
        System.out.println();

        MusicBand.transferMembers(group1, group2);

        group1.printMembers();
        group2.printMembers();
    }
}
