package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = new String("0");

        long startConcat= System.currentTimeMillis();
        for (int i = 1; i<=20_000; i++) {
            s = s + " "+ i;
        }
        System.out.println(s);
        long finishConcat = System.currentTimeMillis();
        long timeConcat = finishConcat - startConcat;
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        long startSB= System.currentTimeMillis();
        for (int i = 0; i <= 20_000; i++) {
            stringBuilder.append(i + " ");
        }
        System.out.print(stringBuilder);
        long finishSB = System.currentTimeMillis();
        long timeSB = finishSB - startSB;
        System.out.println();
        System.out.println("Время выполнения программы с конкатенацией " + timeConcat + " мс");
        System.out.println("Время выполнения программы StringBuilder " + timeSB + " мс");
        System.out.println("Разница = " + (timeConcat - timeSB)+ " мс");
    }
}
