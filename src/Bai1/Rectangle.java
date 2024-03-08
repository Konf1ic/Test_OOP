package Bai1;

public class Rectangle extends Shape {

    private double length; // dài
    private double width; // rộng

    public Rectangle(String color, int borderWidth, double length, double width) {
        super(color, borderWidth);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + getColor() + '\'' +
                ", borderWidth=" + getBorderWidth() +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
