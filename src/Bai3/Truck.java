package Bai3;

public class Truck extends Vehicle {

    private int payload;

    public Truck(String brand, String color, int payload) {
        super(brand, color);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
}
