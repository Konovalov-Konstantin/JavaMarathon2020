package day7;

public class Airplane {
    private String producer;
    private int year, length, weight, fuel;

    public static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.length < a2.length) {
            System.out.println(a2.length);
        } else {
            System.out.println(a1.length);
        }
    }

    Airplane(String producer, int year, int length, int weight) {
        fuel = 0;
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2005, 35, 20_000);
        Airplane airplane2 = new Airplane("Boeing", 2005, 45, 20_000);
        compareAirplanes(airplane1, airplane2);
    }
}