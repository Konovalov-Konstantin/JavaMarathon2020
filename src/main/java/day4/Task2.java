package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 0, min=10_000, end_by_null = 0, summ = 0;
        int[] massiv = new int[100];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10_000);
        }
        System.out.print(Arrays.toString(massiv));
        for (int a : massiv) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            if (a % 10 == 0) {
                end_by_null += 1;
                summ+=a;
            }
        }
        System.out.println();
        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);
        System.out.println("Кол-во чисел, оканчивающихся на ноль = " + end_by_null);
        System.out.println("Сумма чисел, оканчивающихся на ноль = " + summ);
    }
}
