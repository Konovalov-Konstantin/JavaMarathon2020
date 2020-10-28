package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String city = " ";
        while (!city.equals("Stop")) {
            System.out.println("Введите название города. Для выхода введите \"Stop\"");
            Scanner sc = new Scanner(System.in);
            city = sc.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}

