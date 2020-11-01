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

//        String playerName = "";
//        for (int j=1; j<7; j++) {
//            Player player = new Player();
//            playerName = "player " + j;
//            System.out.println("Игрок " + playerName + " - выносливость " + player.getStamina());
//        }

        Player.info();
        System.out.println();
        while (player1.stamina > 0) {
            player1.run(player1);
        }
//        System.out.println(Player.countPlayers);
        Player.info();
    }
}

class Player {
    int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player() {
        Random random = new Random();
        stamina = random.nextInt(11) + 90;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run(Player p) {
        p.stamina -= 1;
        if (p.stamina < 1) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 5:
                    System.out.println("Команды не полные, на поле есть " + (countPlayers) + " мест");
                    break;
                case 4:
                case 3:
                case 2:
                    System.out.println("Команды не полные, на поле есть " + (countPlayers) + " места");
                    break;
                case 1:
                    System.out.println("Команды не полные, на поле есть " + (countPlayers) + " место");
                    break;
            }
        } else {
            System.out.println("На поле нет свободных мест");
          }
    }
}
