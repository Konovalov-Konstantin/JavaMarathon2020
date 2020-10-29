package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 5) {
            System.out.println("Введите два числа");
            i++;
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

