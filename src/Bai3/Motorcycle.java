package Bai3;

public class Motorcycle extends Vehicle {

    private int dungTichDongCo;

    public Motorcycle(String brand, String color, int dungTichDongCo) {
        super(brand, color);
        this.dungTichDongCo = dungTichDongCo;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "dungTichDongCo=" + dungTichDongCo +
                '}';
    }
}
