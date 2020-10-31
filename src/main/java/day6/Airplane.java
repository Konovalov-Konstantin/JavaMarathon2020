package day6;

public class Airplane {
    private String producer;
    private int year, length, weight, fuel;

    public int getFuel () {
        return fuel;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public void setLength (int length) {
        this.length = length;
    }

    Airplane (String producer, int year, int length, int weight) {
        fuel = 0;
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    void info () {
        System.out.println("Изготовитель " + producer);
        System.out.println("Год выпуска " + year);
        System.out.println("Длина " + length);
        System.out.println("Вес " + weight);
        System.out.println("Кол-во топлива в баке " + fuel);
    }
    void fillup (int liters) {
        this.fuel = liters;
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2005, 35, 20_000);
//        airplane.info();
        airplane.setYear(2010);
        airplane.setLength(45);
        airplane.fillup(800);
        airplane.fillup(2000);
//        System.out.println();
        airplane.info();
    }
}