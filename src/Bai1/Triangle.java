package Bai1;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, int borderWidth, double sideA, double sideB, double sideC) {
        super(color, borderWidth);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double S = (sideA + sideB + sideC) / 2;
        return Math.sqrt(S * (S - sideA) * (S - sideB) * (S - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + getColor() + '\'' +
                ", borderWidth=" + getBorderWidth() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
