package Lesson3.Task2;

public class Cat extends Animal {
    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает!");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест пойманную мышь!");
    }
}
