package Bai2;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sủa: Gâu gâu!");
    }

    @Override
    public void move() {
        System.out.println("Di chuyển: Chạy bằng 6 chân");
    }
}
