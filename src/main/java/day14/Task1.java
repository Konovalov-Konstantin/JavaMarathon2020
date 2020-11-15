package day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("day_14_lesson.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    static void printSumDigits(File f) throws FileNotFoundException {
        int sum = 0;
        Scanner scanner = new Scanner(f);
        String line = scanner.nextLine();
        String[] string = line.split(" ");
        List<Integer> listNumbers = new ArrayList<>();
        for (String i : string) {
            listNumbers.add(Integer.parseInt(i));
        }
        scanner.close();
        if (listNumbers.size()!=10) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Некорректный файл");
                return;
            }
        }
        System.out.println(listNumbers);
        for (Integer j : listNumbers) {
            sum+=j;
        }
        System.out.println("Сумма чисел в файле = " + sum);
    }
}
