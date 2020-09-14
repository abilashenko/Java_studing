package Lesson3.Task2;

public class Cat extends Animal {
    String name;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Кошка мяукает!");
    }

    @Override
    void eat() {
        System.out.println("Кошка ест пойманную мышь!");
    }
}
