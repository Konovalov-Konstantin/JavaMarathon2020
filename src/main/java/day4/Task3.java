package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int summ_stroka = 0;
        int[] max = new int[12];
        int[][] mass = new int[12][8];
        for (int i = 0; i < mass.length; i++) {             // заполнение массива
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < mass.length; i++) {             // вывод массива
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {             // вычисление суммы построчно
            for (int j = 0; j < mass[i].length; j++) {
                summ_stroka += mass[i][j];
            }
            max[i] = summ_stroka;                           //доп.массив "max" для сохранения значений сумм строк
            System.out.print(max[i] + " ");
            summ_stroka = 0;                                //обнуление значения суммы
        }
        System.out.println();

        int maximum = 0;                                    // поиск максимального значения в доп.массиве "max"
        int m = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] > maximum) {
                maximum = max[i];
                m = i;
            }
        }
        System.out.println("№ cтроки с максимальной суммой элементов - " + m);
    }
}
