package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());

    }

    public static List<String> parseFileToStringList() {
        List<String> people = new ArrayList<>();
        File file = new File("People.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] element = line.split(" ");
                if (Integer.parseInt(element[1]) < 0)
                    throw new Exception();
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный файл");
        }
        return null;
    }
}


