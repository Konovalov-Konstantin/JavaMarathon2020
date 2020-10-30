package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] mass = new int [100];
        Random random = new Random();
        for (int i =0; i< mass.length; i++) {
            mass[i] = random.nextInt(10_000);
        }
        System.out.print(Arrays.toString(mass));
        System.out.println();
        int max = 0;
        int index_max = 0;
        for (int i = 0; i< mass.length-2; i++) {
            int sum3 = 0;
            for (int j = i; j< i+3; j++) {
                sum3 += mass[j];
//                System.out.println(sum3);
            }
            if (sum3>max) {max = sum3; index_max = i;}
        }
        System.out.println("Индекс первого элемента тройки с максимальной суммой - " + index_max);
        System.out.println("Максимальная сумма тройки элементов = " + max);
    }
}
