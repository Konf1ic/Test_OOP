package Bai3;

public class Car extends Vehicle {

    private int seats;

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", numSeats=" + seats +
                '}';
    }
}
