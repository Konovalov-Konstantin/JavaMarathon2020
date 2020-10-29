package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        int n = s.nextInt();
        int bolee_vosmi = 0, ravno_odin = 0, chethoe = 0, nechetnoe = 0, summa = 0;
        int[] massiv = new int[n];
        for (int a = 0; a < massiv.length; a++) {
            massiv[a] = random.nextInt(10);
            System.out.print(massiv[a] + " ");
        }
        System.out.println();
        for (int a : massiv) {
            if (a > 8) {
                bolee_vosmi += 1;
            }
            if (a == 1) {
                ravno_odin += 1;
            }
            if (a % 2 == 0) {
                chethoe += 1;
            }
            if (a % 2 != 0) {
                nechetnoe += 1;
            }
            summa += a;
        }
        System.out.println("Длина массива  = " + massiv.length);
        System.out.println("Количество цифр более восьми = " + bolee_vosmi);
        System.out.println("Количеств единиц = " + ravno_odin);
        System.out.println("Количество четных чисел = " + chethoe);
        System.out.println("Количество нечетных чисел = " + nechetnoe);
        System.out.println("Сумма элементов массива =  " + summa);
    }
}
