package day6;

class Car {
    private int yearOfProduction;

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int year) {
        return year - this.yearOfProduction;
    }
}
