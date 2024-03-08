package Bai2;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Kêu: Nyan!");
    }

    @Override
    public void move() {
        System.out.println("Di chuyển: Đi bằng 16 chân");
    }
}
