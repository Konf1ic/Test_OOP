package Bai1;

public abstract class Shape {

    private String color;
    private int borderWidth;

    public Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", borderWidth=" + borderWidth +
                '}';
    }
}

class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle("Red", 2, 5.0, 3.0);
        System.out.println(rectangle);
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());

        Shape circle = new Circle("Blue", 1, 4.0);
        System.out.println(circle);
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        Shape triangle = new Triangle("Green", 3, 6.0, 8.0, 10.0);
        System.out.println(triangle);
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());
    }
}
