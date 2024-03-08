package Bai2;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();

    public abstract void move();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Tùng", 18);
        System.out.println(dog);
        dog.makeSound();
        dog.move();

        Animal cat = new Cat("Tùng 2", 19);
        System.out.println(cat);
        cat.makeSound();
        cat.move();

        Animal bird = new Bird("Tùng 3", 20);
        System.out.println(bird);
        bird.makeSound();
        bird.move();
    }
}