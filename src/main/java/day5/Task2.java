package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike m1 = new Motorbike(2015, "Black", "Ducatti");
        System.out.println("Год выпуска " + m1.getGodVypuska());
        System.out.println("Модель " + m1.getModel());
        System.out.println("Цвет " + m1.getTsvet());
    }
}

class Motorbike {
    private int godVypuska;
    private String tsvet;
    private String model;

    public Motorbike(int godVypuska, String tsvet, String model) {
        this.godVypuska = godVypuska;
        this.tsvet = tsvet;
        this.model = model;
    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public String getTsvet() {
        return tsvet;
    }

    public String getModel() {
        return model;
    }
}
