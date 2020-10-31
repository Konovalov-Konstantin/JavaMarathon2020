package day6;

class Motorbike {
    private int yearOfProduction;

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int year) {
        return year - this.yearOfProduction;
    }
}

