package day7;

public class Airplane {
    private String producer;
    private int year, length, weight, fuel;

    public static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.length < a2.length) {
            System.out.println("Второй самолет длиннее, его длина = " + a2.length + " м");
        } else if (a1.length > a2.length) {
            System.out.println("Первый самолет длиннее, его длина = " + a1.length + " м");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }

    Airplane(String producer, int year, int length, int weight) {
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