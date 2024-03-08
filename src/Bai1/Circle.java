package Bai1;

public class Circle extends Shape {

    private double radius; // Bán kính

    public Circle(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + getColor() + '\'' +
                ", borderWidth=" + getBorderWidth() +
                ", radius=" + radius +
                '}';
    }
}