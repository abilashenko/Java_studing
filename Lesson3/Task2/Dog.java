package Lesson3.Task2;

public class Dog extends Animal {
    private String kind;

    public Dog(String food, String location, String kind) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака рычит и гавкает!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест кусок свежего мяса!");
    }
}
