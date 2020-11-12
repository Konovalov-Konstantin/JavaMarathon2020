package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand Queen = new MusicBand("Queen", 1970);
        MusicBand Rammstein = new MusicBand("Rammstein", 1994);
        MusicBand Nirvana = new MusicBand("Nirvana", 1987);
        MusicBand Beatles = new MusicBand("Beatles", 1960);
        MusicBand ACDC = new MusicBand("ACDC", 1973);
        MusicBand Metallica = new MusicBand("Metallica", 1981);
        MusicBand Pink_Floyd = new MusicBand("Pink_Floyd", 1965);
        MusicBand OneRepublic = new MusicBand("OneRepublic", 2002);
        MusicBand FallOutBoy = new MusicBand("FallOutBoy", 2001);
        MusicBand IMAGINE_DRAGONS = new MusicBand("IMAGINE_DRAGONS", 2010);
        ArrayList<MusicBand> groups = new ArrayList<>();
        groups.add(Queen);
        groups.add(Rammstein);
        groups.add(Nirvana);
        groups.add(Beatles);
        groups.add(ACDC);
        groups.add(Metallica);
        groups.add(Pink_Floyd);
        groups.add(OneRepublic);
        groups.add(FallOutBoy);
        groups.add(IMAGINE_DRAGONS);
        System.out.println(groups);
        Collections.shuffle(groups);        //перемешивание элементов коллекции
        System.out.println(groups);
        System.out.println();
        groupsAfter2000(groups);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List <MusicBand> groups1 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                groups1.add(bands.get(i));
            }
        }
        System.out.println("Группы, основанные после 2000 года - " + groups1);
        return groups1;
    }
}
