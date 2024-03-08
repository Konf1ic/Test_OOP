package Bai3;

public class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Vehicle() {
    }

    public void start() {
        System.out.println("Khởi động xe...");
    }

    public void accelerate() {
        System.out.println("Tăng tốc...");
    }

    public void stop() {
        System.out.println("Dừng lại...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Xám", 5);
        car.start();
        car.accelerate();
        car.stop();
        System.out.println(car);

        Motorcycle motorcycle = new Motorcycle("Honda", "Đỏ", 150);
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();
        System.out.println(motorcycle);

        Truck truck = new Truck("Hyundai", "Trắng", 5000);
        truck.start();
        truck.accelerate();
        truck.stop();
        System.out.println(truck);
    }
}