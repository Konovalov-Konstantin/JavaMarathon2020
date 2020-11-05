package day8;

public class Airplane {
    private String producer;
    private int year, length, weight, fuel;

    Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Изготовитель " + producer + "\n" + "Год выпуска " + year + "\n" + "Длина " + length + "\n" +
                "Вес " + weight);
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2005, 35, 20_000);
        System.out.println(airplane.toString());
    }
}