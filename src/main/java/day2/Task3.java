package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Ведите два числа");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (b > a) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
                a++;
            }
        }
    }
}
