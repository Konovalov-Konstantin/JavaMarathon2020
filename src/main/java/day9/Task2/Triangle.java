package day9.Task2;

public class Triangle extends Figure {
    private int length, width, height;

    public Triangle(String color, int length, int width, int height) {
        super(color);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double area() {
        int p = ((length+width+height)/2);
        return Math.pow((p*(p-length)*(p-width)*(p-height)), 0.5);
    }

    public double perimeter () {
        return (length + width + height);
    }
}
