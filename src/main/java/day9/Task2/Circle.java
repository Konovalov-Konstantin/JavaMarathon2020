package day9.Task2;

public class Circle extends Figure {
    private int radius;

    public Circle (String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return (3.14 * radius * radius);
    }

    public double perimeter () {
        return (2 * 3.14 * radius);
    }
}
