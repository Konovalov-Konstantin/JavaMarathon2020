package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        System.out.println("Сумма площадей красных фигур =" + calculateRedArea(figures));
        System.out.println("Сумма периметров красных фигур =" + calculateRedPerimeter(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumP = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sumP += figures[i].perimeter();
            }
        }
        return sumP;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sumArea += figures[i].area();
            }
        }
        return sumArea;
    }

}


