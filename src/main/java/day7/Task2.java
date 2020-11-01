package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        System.out.println("Игрок player 1" + " выносливость " + player1.getStamina());
        System.out.println("Игрок player 2" + " выносливость " + player2.getStamina());
        System.out.println("Игрок player 3" + " выносливость " + player3.getStamina());
        System.out.println("Игрок player 4" + " выносливость " + player4.getStamina());
        System.out.println("Игрок player 5" + " выносливость " + player5.getStamina());
        System.out.println("Игрок player 6" + " выносливость " + player6.getStamina());
        System.out.println();

        Player.info();
        System.out.println();

        player1.run();

        Player.info();
    }
}

class Player {
    int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player() {
        Random random = new Random();
        stamina = random.nextInt(11) + 90;
        if (countPlayers < 6) {
            countPlayers++;
        } else {
            countPlayers = 6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > 0) {
            while (stamina > 0) {
                stamina -= 1;
            }
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6 ) {
            switch (countPlayers) {
                case 5:
                    System.out.println("Команды не полные, на поле есть " + (6 - countPlayers) + " место");
                    break;
                case 4:
                case 3:
                case 2:
                    System.out.println("Команды не полные, на поле есть " + (6 - countPlayers) + " места");
                    break;
                default:
                    System.out.println("Команды не полные, на поле есть " + (6 - countPlayers) + " мест");
                    break;
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
