package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Введите два числа");
            i++;
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
                if (b == 0) {
                    System.out.println("Деление на ноль");
                    continue;
                }
            System.out.println("Результат деления a/b = " + a / b);
        }
    }
}

