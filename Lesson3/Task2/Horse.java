package Lesson3.Task2;

public class Horse extends Animal {
    private int age;

    public Horse(String food, String location, int age) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь стучит копытами!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь щиплет травку!");
    }
}
