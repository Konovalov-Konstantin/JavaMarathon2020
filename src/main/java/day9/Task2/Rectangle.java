package day9.Task2;

public class Rectangle extends Figure {
    private int length, width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double area() {
        return (length * width);
    }

    public double perimeter () {
        return ((length + width)*2);
    }
}
