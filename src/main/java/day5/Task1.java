package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setgodVypuska(1990);
        car1.setmodel("Audi");
        car1.settsvet("White");
        System.out.println("Год выпуска " + car1.getgodVypuska());
        System.out.println("Модель " + car1.getmodel());
        System.out.println("Цвет " + car1.gettsvet());
    }
}

class Car {
    private int godVypuska;
    private String tsvet;
    private String model;

    public void setgodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    public int getgodVypuska() {
        return godVypuska;
    }

    public void settsvet(String tsvet) {
        this.tsvet = tsvet;
    }

    public String gettsvet() {
        return tsvet;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public String getmodel() {
        return model;
    }
}
