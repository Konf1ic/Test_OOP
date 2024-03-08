package Bai2;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Hót: líu lo!");
    }

    @Override
    public void move() {
        System.out.println("Di chuyển: Đào đất");
    }
}
