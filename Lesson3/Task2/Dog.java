package Lesson3.Task2;

public class Dog extends Animal {
    String kind;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Собака рычит и гавкает!");
    }

    @Override
    void eat() {
        System.out.println("Собака ест кусок свежего мяса!");
    }
}
