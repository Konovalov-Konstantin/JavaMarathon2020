package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shoes.csv");
        File file1 = new File("missing_shoes.txt");
        PrintWriter pw = new PrintWriter(file1);
        pw.println("Отсутствуют на складе: " + "\n");
        int i = 1;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] element = line.split(";");
                if (Integer.parseInt(element[2]) == 0) {
                    pw.println(i + " " + element[0] + " размер - " + element[1]);
                    i++;
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
